public class SharedPref_test {

    private final TEXT1;
    private final TEXT2;

    public void SaveNote (Hashmap<String, String> hashmap) {
    
        SharedPreferences sp = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
        SharedPreferences.Editor editor = SharedPreferences.edit();
        editor.putString(TEXT1, hashmap.getKey());     // store the title of the note
        editor.putString(TEXT2, hashmap.get(hashmap.getKey()));    // store the description
        editor.apply();
    
    }
    
    public void LoadNotes (Hashmap<String, String> hashmap) {
    
        SharedPreferences sp = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
        String title = sp.getString(TEXT1, "default value");
        String noteDesc = sp.getString(TEXT2, "default value);
    
    }

}
