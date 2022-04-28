/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class AudioMediaRecorder extends AudioMedia {
  private transient long swigCPtr;

  protected AudioMediaRecorder(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.AudioMediaRecorder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AudioMediaRecorder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_AudioMediaRecorder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AudioMediaRecorder() {
    this(pjsua2JNI.new_AudioMediaRecorder(), true);
  }

  public void createRecorder(String file_name, long enc_type, int max_size, long options) throws Exception {
    pjsua2JNI.AudioMediaRecorder_createRecorder__SWIG_0(swigCPtr, this, file_name, enc_type, max_size, options);
  }

  public void createRecorder(String file_name, long enc_type, int max_size) throws Exception {
    pjsua2JNI.AudioMediaRecorder_createRecorder__SWIG_1(swigCPtr, this, file_name, enc_type, max_size);
  }

  public void createRecorder(String file_name, long enc_type) throws Exception {
    pjsua2JNI.AudioMediaRecorder_createRecorder__SWIG_2(swigCPtr, this, file_name, enc_type);
  }

  public void createRecorder(String file_name) throws Exception {
    pjsua2JNI.AudioMediaRecorder_createRecorder__SWIG_3(swigCPtr, this, file_name);
  }

  public static AudioMediaRecorder typecastFromAudioMedia(AudioMedia media) {
    long cPtr = pjsua2JNI.AudioMediaRecorder_typecastFromAudioMedia(AudioMedia.getCPtr(media), media);
    return (cPtr == 0) ? null : new AudioMediaRecorder(cPtr, false);
  }

}
