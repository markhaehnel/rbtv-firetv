package de.markhaehnel.rbtv.rocketbeanstv;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class GetAccesToken extends AsyncTask<Context, Void, JSONObject> {
    protected JSONObject doInBackground(Context... contexts) {

        try {
            String response = HttpRequest.get("http://api.twitch.tv/api/channels/rocketbeanstv/access_token").body();
            JSONObject json = new JSONObject(response);
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }

    }

    protected void onPostExecute(Long result) {

    }
}