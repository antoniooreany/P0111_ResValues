package com.antoniooreany.p0111_resvalues;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    int imageViewIcon;
    boolean imageViewIconBlack;
    boolean imageViewIconLarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageViewIcon = R.drawable.ic_android_black_48dp;
        imageViewIconBlack = true;
        imageViewIconLarge = true;
        imageView.setImageDrawable(getResources().getDrawable(imageViewIcon));

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageViewIconBlack && imageViewIconLarge) {
                    imageViewIcon = R.drawable.ic_android_grey600_48dp;
                    imageViewIconBlack = false;
                    imageViewIconLarge = true;
                } else if (!imageViewIconBlack && imageViewIconLarge){
                    imageViewIcon = R.drawable.ic_android_black_18dp;
                    imageViewIconBlack = true;
                    imageViewIconLarge = false;
                } else if (imageViewIconBlack && !imageViewIconLarge) {
                    imageViewIcon = R.drawable.ic_android_grey600_18dp;
                    imageViewIconBlack = false;
                    imageViewIconLarge = false;
                } else if (!imageViewIconBlack && !imageViewIconLarge) {
                    imageViewIcon = R.drawable.ic_android_black_48dp;
                    imageViewIconBlack = true;
                    imageViewIconLarge = true;
                }
                Resources resources = getResources();
                Drawable drawable = resources.getDrawable(MainActivity.this.imageViewIcon);
                imageView.setImageDrawable(drawable);
            }
        };
        imageView.setOnClickListener(onClickListener);
    }
}
