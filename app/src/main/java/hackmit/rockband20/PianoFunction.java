package hackmit.rockband20;


import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.view.MotionEvent;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;

/**
 * Created by Fate on 9/17/2016.
 */
public class PianoFunction extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final View decorView = getWindow().getDecorView();

        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LOW_PROFILE
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        decorView.setOnSystemUiVisibilityChangeListener
                (new View.OnSystemUiVisibilityChangeListener() {
                    @Override
                    public void onSystemUiVisibilityChange(int visibility) {
                        // Note that system bars will only be "visible" if none of the
                        // LOW_PROFILE, HIDE_NAVIGATION, or FULLSCREEN flags are set.
                        if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                            // TODO: The system bars are visible. Make any desired
                            decorView.setSystemUiVisibility(
                                    View.SYSTEM_UI_FLAG_LOW_PROFILE
                                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
                            ActionBar actionBar = getSupportActionBar();
                            if (actionBar != null) {
                                actionBar.hide();
                            }
                        }
                    }
                });

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        setContentView(R.layout.piano);

        final Button cnote = (Button) findViewById(R.id.button4);

        cnote.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer notec = MediaPlayer.create(PianoFunction.this, R.raw.c_note);
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    notec.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    notec.pause();
                    notec.stop();
                    notec.release();
                    notec = MediaPlayer.create(PianoFunction.this, R.raw.c_note);

                }
                return false;
            }

        });

        final Button dnote = (Button) findViewById(R.id.button5);

        dnote.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer noted = MediaPlayer.create(PianoFunction.this, R.raw.d_note);
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    noted.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    noted.pause();
                    noted.stop();
                    noted.release();
                    noted = MediaPlayer.create(PianoFunction.this, R.raw.d_note);

                }
                return false;
            }

        });

        final Button enote = (Button) findViewById(R.id.button6);

        enote.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer notee = MediaPlayer.create(PianoFunction.this, R.raw.e_note);
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    notee.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    notee.pause();
                    notee.stop();
                    notee.release();
                    notee = MediaPlayer.create(PianoFunction.this, R.raw.e_note);

                }
                return false;
            }

        });

        final Button fnote = (Button) findViewById(R.id.button7);

        fnote.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer notef = MediaPlayer.create(PianoFunction.this, R.raw.f_note);
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    notef.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    notef.pause();
                    notef.stop();
                    notef.release();
                    notef = MediaPlayer.create(PianoFunction.this, R.raw.f_note);

                }
                return false;
            }

        });

        final Button gnote = (Button) findViewById(R.id.button8);

        gnote.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer noteg = MediaPlayer.create(PianoFunction.this, R.raw.g_note);
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    noteg.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    noteg.pause();
                    noteg.stop();
                    noteg.release();
                    noteg = MediaPlayer.create(PianoFunction.this, R.raw.g_note);

                }
                return false;
            }

        });

        final Button anote = (Button) findViewById(R.id.button9);


        anote.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer notea = MediaPlayer.create(PianoFunction.this, R.raw.a_note);
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    notea.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    notea.pause();
                    notea.stop();
                    notea.release();
                    notea = MediaPlayer.create(PianoFunction.this, R.raw.a_note);

                }
                return false;
            }

        });

        final Button bnote = (Button) findViewById(R.id.button10);


        bnote.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer noteb = MediaPlayer.create(PianoFunction.this, R.raw.b_note);
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    noteb.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    noteb.pause();
                    noteb.stop();
                    noteb.release();

                    noteb=MediaPlayer.create(PianoFunction.this, R.raw.b_note);




                }
                return false;
            }

        });

        //WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);

        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#CD5C5C"));
        Bitmap bg = Bitmap.createBitmap(480, 800, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bg);
        canvas.drawRect(-999, 600, 9999, 605, paint);
        LinearLayout ll = (LinearLayout) findViewById(R.id.screen);
        ll.setBackgroundDrawable(new BitmapDrawable(bg));

        Bars a= new Bars("a", 0,0);
        /**Bars b= new Bar('b',0,0);
        Bars c= new Bar('c',0,0);
        Bars d= new Bar('d'0,0);
        Bars e= new Bar('e',0,0);
        Bars f= new Bar('f',0,0);
        Bars g= new Bar('g',0,0);
        **/






//        final Button multi = (Button) findViewById(R.id.multi_button);
//        multi.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Switch to next activity
//                Intent intent = new Intent(PlayerScreen.this, SongList.class);
//                startActivity(intent);
//            }
//        });


    }


}
