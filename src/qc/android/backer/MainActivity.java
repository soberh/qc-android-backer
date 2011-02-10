package qc.android.backer;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	protected String TAG = getClass().getSimpleName();
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		Button btnBackup = (Button) findViewById(R.id.ButtonBackup);
		btnBackup.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Log.d(TAG, "click btnBackup");
			}
		});

		Button btnRestore = (Button) findViewById(R.id.ButtonRestore);
		btnRestore.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Log.d(TAG, "click btnRestore");
			}
		});

		Button btnScheduleBackup = (Button) findViewById(R.id.ButtonScheduleBackup);
		btnScheduleBackup.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Log.d(TAG, "click btnScheduleBackup");
			}
		});
    }
}