
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox chkMagicians, chkBigBang, chkAndroidTutor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkMagicians = (CheckBox) findViewById(R.id.chkMagicians);
        chkBigBang = (CheckBox) findViewById(R.id.chkBigBang);
        chkAndroidTutor = (CheckBox) findViewById(R.id.chkAndroidTutor);

        chkBigBang.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked)
                    Toast.makeText(MainActivity.this, "You watched Big Bang", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "You should see Big Bang!", Toast.LENGTH_SHORT).show();
            }
        });

        chkMagicians.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked)
                    Toast.makeText(MainActivity.this, "You watched Magicians", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "You should see Magicians!", Toast.LENGTH_SHORT).show();
            }
        });

        if (chkMagicians.isChecked()) {
            Toast.makeText(this, "Magicians!", Toast.LENGTH_SHORT).show();
        }
        if (chkBigBang.isChecked()) {
            Toast.makeText(this, "BigBang!", Toast.LENGTH_SHORT).show();
        }
        if (chkAndroidTutor.isChecked()) {
            Toast.makeText(this, "Android Tutorial!", Toast.LENGTH_SHORT).show();
        }

    }
}