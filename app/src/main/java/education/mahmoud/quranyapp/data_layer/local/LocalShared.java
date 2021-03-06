package education.mahmoud.quranyapp.data_layer.local;

import android.content.Context;
import android.content.SharedPreferences;

import education.mahmoud.quranyapp.Util.Constants;

public class LocalShared {

    private SharedPreferences preferences;

    public LocalShared(Context context) {
        preferences = context.getSharedPreferences("quran_data", Context.MODE_PRIVATE);
//        editor = preferences.edit();
    }

    public void addLastSura(int index) {
        preferences.edit().putInt(Constants.LAST_INDEX, index).apply();
    }

    public void addLastSuraWithScroll(int index) {
        preferences.edit().putInt(Constants.LAST_INDEX_Scroll, index).apply();
    }

    public int getLastSura() {
        return preferences.getInt(Constants.LAST_INDEX, -1);
    }

    public int getLastSuraWithScroll() {
        return preferences.getInt(Constants.LAST_INDEX_Scroll, -1);
    }

    public boolean getPermissionState() {
        return preferences.getBoolean(Constants.PERMISSION_STATE, false);
    }

    public void setPermissionState(boolean state) {
        preferences.edit().putBoolean(Constants.PERMISSION_STATE, state).apply();
    }

}
