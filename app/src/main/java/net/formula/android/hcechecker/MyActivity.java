package net.formula.android.hcechecker;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;


public class MyActivity extends Activity {

    private TextView supportOrNot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        supportOrNot = (TextView)findViewById(R.id.supportOrNot);
    }

    @Override
    protected void onResume() {
        super.onResume();

        boolean supportHce = getPackageManager().hasSystemFeature(PackageManager.FEATURE_NFC_HOST_CARD_EMULATION);
        int msgId = supportHce ? R.string.supported : R.string.not_supported;

        supportOrNot.setText(msgId);
    }

}
