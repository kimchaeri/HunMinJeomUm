package com.example.hunminjungum;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class SuggestBoardListViewRequest extends StringRequest {
    final static private String URL  = "http://192.168.43.21/suggestboardlistview.php";
    private Map<String, String> map;

    public SuggestBoardListViewRequest(int postnum, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("postnum", postnum+"");
    }
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
