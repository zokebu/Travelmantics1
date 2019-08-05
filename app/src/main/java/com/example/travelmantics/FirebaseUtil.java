package com.example.travelmantics;

import android.app.Activity;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.auth.api.Auth;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirebaseUtil {
    public  static FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference mDatabaseReference;
    public static FirebaseAuth zFirebaseAuth;
     public static FirebaseAuth.AuthStateListener zAuthlistener;
     public static final int RC_SIGN_IN =123;
     private static Activity caller;
    private static FirebaseUtil firebaseUtil;
    public static ArrayList<TravelDeal> mDeals;

     private FirebaseUtil(){}

     public static void openFbReference (String ref, final Activity callerActivity){
         if(firebaseUtil == null){
             firebaseUtil = new FirebaseUtil();
             mFirebaseDatabase = FirebaseDatabase.getInstance();

         mDeals = new ArrayList<TravelDeal>();
         mDatabaseReference=mFirebaseDatabase.getReference().child(ref);

     }

     }


}
