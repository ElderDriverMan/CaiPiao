package sion.my.caipiao.until;

import android.os.Handler;
import android.os.Looper;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Okhttpuntil {
    public static Handler handler = new Handler(Looper.getMainLooper());
    public static OkHttpClient okHttpClient=new OkHttpClient();
    public static  <T>T synGetRequesr(String url,Class<T> myclass) throws IOException {
        Call call = okHttpClient.newCall(new Request.Builder().url(url).get().build());
        Response execute = call.execute();
        return new Gson().fromJson(execute.body().string(),myclass);
    }
}
