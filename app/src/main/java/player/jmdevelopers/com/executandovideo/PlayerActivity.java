package player.jmdevelopers.com.executandovideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        videoView=findViewById(R.id.videoView);
        // configurando
        // esconder notificações

        View decorview=getWindow().getDecorView();
        int uiopcoes=View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorview.setVisibility(uiopcoes);
        // esconder a actionbar

        getSupportActionBar().hide();
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.video);
        videoView.start();
    }
}
