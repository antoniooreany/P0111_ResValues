package com.antoniooreany.p0111_resvalues;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final int BLACK_48DP = 1;
    private static final int GREY_48DP = 2;
    private static final int BLACK_18DP = 3;
    private static final int GREY_18DP = 4;
    private ImageView imageView;
    private int imageViewIcon;
    private int imageViewIconType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageViewIcon = R.drawable.ic_android_black_48dp;
        imageViewIconType = BLACK_48DP;
        imageView.setImageDrawable(getResources().getDrawable(imageViewIcon));

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (imageViewIconType) {
                    case BLACK_48DP:
                        imageViewIcon = R.drawable.ic_android_grey600_48dp;
                        imageViewIconType = GREY_48DP;
                        break;
                    case GREY_48DP:
                        imageViewIcon = R.drawable.ic_android_black_18dp;
                        imageViewIconType = BLACK_18DP;
                        break;
                    case BLACK_18DP:
                        imageViewIcon = R.drawable.ic_android_grey600_18dp;
                        imageViewIconType = GREY_18DP;
                        break;
                    case GREY_18DP:
                        imageViewIcon = R.drawable.ic_android_black_48dp;
                        imageViewIconType = BLACK_48DP;
                        break;

                }
                Resources resources = getResources();
                Drawable drawable = resources.getDrawable(MainActivity.this.imageViewIcon);
                imageView.setImageDrawable(drawable);
            }
        };
        imageView.setOnClickListener(onClickListener);
    }
}
