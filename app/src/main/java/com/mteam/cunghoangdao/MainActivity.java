package com.mteam.cunghoangdao;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mteam.cunghoangdao.R;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivSelect;
    private TextView tvTitleSelect, tvContentSelect;

    private ImageView ivDetail;
    private TextView tvTitleDetail, tvContentDetail;

    private int mIdTextTitle;
    private int mIdImage;
    private int mIdTextContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_home);

        ivSelect = findViewById(R.id.iv_select);
        tvTitleSelect = findViewById(R.id.tv_title_select);
        tvContentSelect = findViewById(R.id.tv_content_select);

        ivDetail = findViewById(R.id.iv_detail);
        tvTitleDetail = findViewById(R.id.tv_title_detail);
        tvContentDetail = findViewById(R.id.tv_content_detail);

        findViewById(R.id.iv_bachduong).setOnClickListener(this);
        findViewById(R.id.iv_bao_binh).setOnClickListener(this);
        findViewById(R.id.iv_bocap).setOnClickListener(this);
        findViewById(R.id.iv_cu_giai).setOnClickListener(this);
        findViewById(R.id.iv_kimnguu).setOnClickListener(this);
        findViewById(R.id.iv_maket).setOnClickListener(this);
        findViewById(R.id.iv_nhan_ma).setOnClickListener(this);
        findViewById(R.id.iv_songngu).setOnClickListener(this);
        findViewById(R.id.iv_songtu).setOnClickListener(this);
        findViewById(R.id.iv_thienbinh).setOnClickListener(this);
        findViewById(R.id.iv_xu_nu).setOnClickListener(this);
        findViewById(R.id.iv_sutu).setOnClickListener(this);

        findViewById(R.id.bt_see).setOnClickListener(this);
        findViewById(R.id.bt_back).setOnClickListener(this);

        //for default
        showHome();
        showBriefContent(R.drawable.ic_bach_duong, R.string.bach_duong_title1, R.string.bach_duong_title2, R.string.bach_duong_text);
    }

    private void showHome() {
        findViewById(R.id.view_home).setVisibility(View.VISIBLE);
        findViewById(R.id.view_chi_tiet).setVisibility(View.GONE);
    }

    private void showDetail() {
        findViewById(R.id.view_chi_tiet).setVisibility(View.VISIBLE);
        findViewById(R.id.view_home).setVisibility(View.GONE);
        tvTitleDetail.setText(mIdTextTitle);
        tvContentDetail.setText(mIdTextContent);
        ivDetail.setImageResource(mIdImage);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_bachduong:
                showBriefContent(R.drawable.ic_bach_duong,
                        R.string.bach_duong_title1,
                        R.string.bach_duong_title2,
                        R.string.bach_duong_text);
                break;
            case R.id.iv_bao_binh:
                showBriefContent(R.drawable.ic_bao_binh,
                        R.string.bao_binh_title1,
                        R.string.bao_binh_title2,
                        R.string.bao_binh_text);
                break;
            case R.id.iv_bocap:
                showBriefContent(R.drawable.ic_bocap,
                        R.string.bo_cap_title1,
                        R.string.bo_cap_title2,
                        R.string.bo_cap_text);
                break;
            case R.id.iv_cu_giai:
                showBriefContent(R.drawable.ic_cu_giai,
                        R.string.cu_giai_title1,
                        R.string.cu_giai_title2,
                        R.string.cu_giai_text);
                break;
            case R.id.iv_kimnguu:
                showBriefContent(R.drawable.ic_kim_nguu,
                        R.string.kim_nguu_title1,
                        R.string.kim_nguu_title2,
                        R.string.kim_nguu_text);
                break;
            case R.id.iv_maket:
                showBriefContent(R.drawable.ic_ma_ket,
                        R.string.ma_ket_title1,
                        R.string.ma_ket_title2,
                        R.string.ma_ket_text);
                break;
            case R.id.iv_nhan_ma:
                showBriefContent(R.drawable.ic_nhan_ma,
                        R.string.nhan_ma_title1,
                        R.string.nhan_ma_title2,
                        R.string.nhan_ma_text);
                break;
            case R.id.iv_songngu:
                showBriefContent(R.drawable.ic_song_ngu,
                        R.string.song_ngu_title1,
                        R.string.song_ngu_title2,
                        R.string.song_ngu_text);
                break;
            case R.id.iv_songtu:
                showBriefContent(R.drawable.ic_song_tu,
                        R.string.song_tu_title1,
                        R.string.song_tu_title2,
                        R.string.song_tu_text);
                break;
            case R.id.iv_thienbinh:
                showBriefContent(R.drawable.ic_thien_binh,
                        R.string.thien_binh_title1,
                        R.string.thien_binh_title2,
                        R.string.thien_binh_text);
                break;
            case R.id.iv_xu_nu:
                showBriefContent(R.drawable.ic_xu_nu,
                        R.string.xu_nu_title1,
                        R.string.xu_nu_title2,
                        R.string.xu_nu_text);
                break;
            case R.id.iv_sutu:
                showBriefContent(R.drawable.ic_su_tu,
                        R.string.su_tu_title1,
                        R.string.su_tu_title2,
                        R.string.su_tu_text);
                break;
            case R.id.bt_see:
                showDetail();
                break;
            case R.id.bt_back:
                showHome();
                break;
            default:
                break;
        }
    }

    private void showBriefContent(int imageId, int icTitle1, int icTitle2, int idContent) {
        mIdTextTitle = icTitle1;
        mIdImage = imageId;
        mIdTextContent = idContent;
        ivSelect.setImageResource(imageId);
        tvTitleSelect.setText(icTitle2);
        tvContentSelect.setText(idContent);
    }
}