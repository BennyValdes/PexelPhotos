package com.example.pexelphotos.view

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.pexelphotos.model.PhotoResponse
import com.example.pexelphotos.model.remote.HttpRequest
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

private const val TAG = "FragmentPhoto"

//HOW TO PROCESS DATA RECEIVED FROM THE MAIN ACTIVITY TO SEND TO THE API
class FragmentPhoto: Fragment() {
//    companion object Factory {
//        fun create(): FragmentPhoto = FragmentPhoto()
//    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getPhotoData()
    }


    private fun getPhotoData() {
        HttpRequest
            .getService()
            .getPhotos("23408719-4037e6fe68e88ad73a5c30d0b","dogs","photo","popular")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object: Observer<PhotoResponse>{
                override fun onSubscribe(d: Disposable) {
                    Log.d(TAG, "onSubscribe: ON SUBSCRIBE ERROR")
                    Toast.makeText(activity, "$", Toast.LENGTH_SHORT).show()
                }

                override fun onNext(t: PhotoResponse) {
                    Log.d(TAG, "onNext: ON NEXT ERROR")
                    t?.let { Toast.makeText(activity, "$it", Toast.LENGTH_SHORT).show() }
                }

                override fun onError(e: Throwable) {
                    Log.d(TAG, "onError: ON ERROR ERROR",e)
                }

                override fun onComplete() {
                    Log.d(TAG, "onComplete: ON COMPLETE ERROR")
                }
            })
    }
}