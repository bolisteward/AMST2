package com.example.amst2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.VideoView;

public class videoView extends AppCompatActivity {
    private RadioGroup g1;
    private RadioButton opcion;
    private Button btnElegir;
    private String eleccion="Opcion 1";

    Uri uri;
    VideoView videoView;
    MediaController mediaController;

    private String automatico="https://r4---sn-jou-btxs.googlevideo.com/videoplayback?expire=1572769484&ei=bDq-Xb2tA8rChwa-4pioBA&ip=179.60.181.119&id=o-AIhMAbFob94Hzz0WagKNqQXNo2A4fXjBpvFIwFVc5c1H&itag=18&source=youtube&requiressl=yes&mime=video%2Fmp4&gir=yes&clen=13522418&ratebypass=yes&dur=193.770&lmt=1569874593018870&fvip=4&fexp=9466585,23842630&beids=9466585&c=WEB&txp=5531432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRAIgd2iBJrzxi-mtXErsCbhRy2n_zRzkcYE1h9N3FIkUqsECID1qApqJfJswnTIgSOszVNQwI7lxZNA3rL3_iAVMEX1k&video_id=5mkketnxB34&title=Loki+-+Destripando+la+Historia&redirect_counter=1&rm=sn-p5qy67z&req_id=667de6bd75ca3ee&cms_redirect=yes&ipbypass=yes&mip=2800:4f0:6e:490:a077:ffb8:b3a9:b96&mm=31&mn=sn-jou-btxs&ms=au&mt=1572749412&mv=m&mvi=3&pl=46&lsparams=ipbypass,mip,mm,mn,ms,mv,mvi,pl&lsig=AHylml4wRQIgfpjHY9pyZ1p0hIJzkaxNf2C_QyjfCRPjMsLPhMd8kr8CIQCumLq-xigxfWcdFXb3-3iMc3dxxvn14sPdTQ11BB3udQ==";
    private String url1= "https://r1---sn-ab5l6ndr.googlevideo.com/videoplayback?expire=1572771224&ei=OEG-Xfn6HYPoD6SAiyg&ip=23.82.82.144&id=o-ANbI9wIK8M3d0RNy-_P2wi-QZaQVkscx68WVgMLPl7i4&itag=18&source=youtube&requiressl=yes&mime=video%2Fmp4&gir=yes&clen=10559209&ratebypass=yes&dur=164.722&lmt=1572530557265631&fvip=1&fexp=23842630&c=WEB&txp=5531432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRgIhALYI4SWyhmU6mABRKQtIZysHV5GsI4AaJxdG4dmDvT8QAiEAuM7hZ-reJ-sDSDNKgw63dfHq-5hoxaQyNLohMk2OPPM%3D&video_id=9eiaiVthVrk&title=Jumanji-+The+Next+Level+Final+Trailer+%282019%29+-+Movieclips+Trailers&rm=sn-vgqkk7e&req_id=e493efa91950a3ee&ipbypass=yes&redirect_counter=2&cm2rm=sn-jou-btxd7e&cms_redirect=yes&mip=2800:4f0:6e:490:a077:ffb8:b3a9:b96&mm=29&mn=sn-ab5l6ndr&ms=rdu&mt=1572749568&mv=m&mvi=0&pl=46&lsparams=ipbypass,mip,mm,mn,ms,mv,mvi,pl&lsig=AHylml4wRQIgbq9vqsey6n_hEjS_4jIJ6RrrVIfbZH3G3F5Pd5lEUSECIQCvs0QnoIKnzCtMQDg0saP0Akw_bMNnGoJoeBv3g_z5Ug==";
    private String url2= "https://r1---sn-jou-btxz.googlevideo.com/videoplayback?expire=1572757144&ei=OAq-XeKxHYnLjATPy6D4DQ&ip=173.248.184.240&id=o-AHzGfeHZYbkpNutSYVT9hh7rHrUlYxFVjIZBA02QXmH7&itag=18&source=youtube&requiressl=yes&mime=video%2Fmp4&gir=yes&clen=43946973&ratebypass=yes&dur=658.099&lmt=1556575048072873&fvip=1&fexp=23842630&c=WEB&txp=5531432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRgIhAJu_wjVOQbFxF1hO7IXI7Mp5dCl3s6DsnWBIrwkhEMWjAiEAwHQr9X_wyxOMnBV90Vhk-gY9rNJZwEl9rm-SX-lsun4%3D&video_id=NaZnmfpo68k&title=Recopilaci%C3%B3n+Caidas+Graciosas++2019&redirect_counter=1&rm=sn-qxoe77e&req_id=fad70c93da96a3ee&cms_redirect=yes&ipbypass=yes&mip=2800:4f0:6e:490:f502:51d9:434:2c4a&mm=31&mn=sn-jou-btxz&ms=au&mt=1572742997&mv=m&mvi=0&pl=46&lsparams=ipbypass,mip,mm,mn,ms,mv,mvi,pl&lsig=AHylml4wRgIhAN6KrTHewTDLYjqhXfaXR8p4njrg21Bda_3XU0qLQUqmAiEAvaQkCxvizVxhV2jykWY65EHYI5_nFUwVDZwKYiigh-E=";
    private String url3= "https://r4---sn-jou-btxs.googlevideo.com/videoplayback?expire=1572764807&ei=Jyi-XcyLJqO2lAPZ_6SYAg&ip=155.254.24.31&id=o-AH43-eALajs3RhPiiD73FaHhKOWrfAoYbFYFoPN1Q3Yx&itag=18&source=youtube&requiressl=yes&mime=video%2Fmp4&gir=yes&clen=39626984&ratebypass=yes&dur=624.941&lmt=1553908699487172&fvip=4&fexp=23842630&c=WEB&txp=5531432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRQIgZGPJGCi1XXlzfs7fsTK_Wj_NTrR_V8CeYo7geGJ1azACIQDyAqu1obxnExuCKsPd-slUdOmaLnfttJHtEVyStwqe5Q%3D%3D&video_id=3p86sLyyagM&title=%E2%96%B6+Inventos+Tecnologicos+-+2019+-+Lo+Ultimo+En+Tecnologia+%2342&redirect_counter=1&rm=sn-5uark7z&req_id=e2e6a541f498a3ee&cms_redirect=yes&ipbypass=yes&mip=2800:4f0:6e:490:f502:51d9:434:2c4a&mm=31&mn=sn-jou-btxs&ms=au&mt=1572743125&mv=m&mvi=3&pl=46&lsparams=ipbypass,mip,mm,mn,ms,mv,mvi,pl&lsig=AHylml4wRgIhANh3kHqF-KMwwvdXtrmcm-zROruPmpp2X02Ke9gJeyl8AiEAtGIM7Lo7WxZTug4WYn2rC68rt7JdpZ1yRYpkkBMHVho=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        Toast.makeText(this, "Video automático",Toast.LENGTH_SHORT).show();

        g1=findViewById(R.id.g1);
        btnElegir=findViewById(R.id.btnElegir);
        videoView =(VideoView)findViewById(R.id.videoView);
        mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        uri=Uri.parse(automatico);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        btnElegir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (eleccion){
                    case "Opcion 1":
                        uri=Uri.parse(url1);
                        break;
                    case "Opcion 2":
                        uri=Uri.parse(url2);
                        break;
                    case "Opcion 3":
                        uri=Uri.parse(url3);
                        break;
                    default:
                        break;
                }
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();

            }
        });
    }

    public void revisar (View view){
        int num= g1.getCheckedRadioButtonId();
        opcion=findViewById(num);
        eleccion=(String) opcion.getText();
        Toast.makeText(this, "Has seleccionado " + eleccion,Toast.LENGTH_SHORT).show();
    }


    public void graficoLineal(View view){
        Intent intent = new Intent(this,LinealGraph.class);
        startActivity(intent);
    }

}
