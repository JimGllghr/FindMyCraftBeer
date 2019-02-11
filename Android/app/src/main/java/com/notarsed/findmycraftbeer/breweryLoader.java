package com.notarsed.findmycraftbeer;

import android.app.DownloadManager;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class breweryLoader  extends AppCompatActivity {
    private List<Brewery> breweryList;
    private boolean wait = true;

    public List<Brewery> getBreweryList(Context context, final BreweryViewFrag nFragment){
        RequestQueue queue = Volley.newRequestQueue(context);
        final String url = "https://4tp70pyz12.execute-api.us-east-1.amazonaws.com/Alpha/brewerys";
        breweryList = new ArrayList<>();
        // prepare the Request
        JsonObjectRequest getRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response) {
                        // display response
                        Log.d("Response", response.toString());
                        try {
                            Brewery nBrewery = new Brewery();
                            JSONObject reader = new JSONObject(response.toString());
                            JSONObject main  = reader.getJSONObject("b01");
                            nBrewery.setName(main.getString("name"));
                            Log.d("name", main.getString("name"));
                            nBrewery.setAddress(main.getString("add"));
                            breweryList.add(nBrewery);
                            nFragment.setBrewery(nBrewery);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Error.Response", "error");
                    }
                }
        );
        // add it to the RequestQueue
        queue.add(getRequest);
        while (!wait)
        {}
        return breweryList;
    }

}
