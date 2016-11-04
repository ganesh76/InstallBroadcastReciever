package g.sampleinstallrecv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by ganesh on 04-11-2016.
 */
public class YourReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Log.e("intent rec::",intent.toString());
        if(intent.getAction().equals(Intent.ACTION_PACKAGE_ADDED))
        {
            String packageName=intent.getData().getEncodedSchemeSpecificPart();
            Toast.makeText(context,"APP installed::"+packageName,Toast.LENGTH_SHORT).show();
        }
        if(intent.getAction().equals(Intent.ACTION_PACKAGE_REMOVED))
        {
            String packageName=intent.getData().getEncodedSchemeSpecificPart();
            Toast.makeText(context,"APP uninstalled::"+packageName,Toast.LENGTH_SHORT).show();
        }
    }
}
