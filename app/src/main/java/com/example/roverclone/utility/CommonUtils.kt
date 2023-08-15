package com.example.roverclone.utility

import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.ConnectivityManager
import android.view.Gravity
import android.widget.Toast
import com.example.roverclone.R

object CommonUtils {
  var loader: ProgressDialog? = null

  fun showToast(context: Context?, message: String?) {
    val toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
    toast.setGravity(Gravity.BOTTOM, 0, 50)
    toast.show()
  }

  fun isNetworkAvailable(mContext: Context): Boolean {
    val connectivityManager =
      mContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetworkInfo = connectivityManager.activeNetworkInfo
    return if (activeNetworkInfo != null && activeNetworkInfo.isConnected) {
      true
    } else {
      showToast(mContext, mContext.resources.getString(R.string.no_internet_found))
      false
    }
  }

  @Throws(Exception::class)
  fun showLoader(context: Context?) {
    if (loader == null) {
      loader = ProgressDialog(context)
      loader?.isIndeterminate = false
      loader?.setCancelable(false)
      loader?.show()
      loader?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
      loader?.setContentView(R.layout.custom_progressbar)
    }
  }

  fun hideLoader() {
    if (loader != null) {
      loader?.dismiss()
      loader = null
    }
  }
}
