package com.stonecolders.checkmate.dash;


import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.stonecolders.checkmate.R;

import static android.app.Activity.RESULT_OK;

public class VaultFragment extends Fragment {

    RecyclerView recyclerView;
    Button addNew;
    ImageView imageview;

    public VaultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_vault, container, false);
        recyclerView = rootView.findViewById(R.id.vault_recycler);
        addNew = rootView.findViewById(R.id.add_new_pic);
        imageview = rootView.findViewById(R.id.imageview);
        addNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context;
                AlertDialog alertDialog = new AlertDialog.Builder(getContext()).create();
                alertDialog.setButton("Take photo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent takePhoto = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivityForResult(takePhoto, 0);
                    }
                });
                alertDialog.setButton("Choose from gallery", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent pickPhoto = new Intent(Intent.ACTION_PICK,
                                MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        startActivityForResult(pickPhoto, 1);
                    }
                });
            }
        });
        return rootView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);
        switch(requestCode) {
            case 0: if(resultCode == RESULT_OK){
                        Uri selectedImage = imageReturnedIntent.getData();
                        imageview.setImageURI(selectedImage);
                    } break;
            case 1: if(resultCode == RESULT_OK){
                        Uri selectedImage = imageReturnedIntent.getData();
                        imageview.setImageURI(selectedImage);
                    } break;
        }
    }
}
