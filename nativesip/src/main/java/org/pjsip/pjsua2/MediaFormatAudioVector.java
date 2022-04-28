/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class MediaFormatAudioVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MediaFormatAudioVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MediaFormatAudioVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_MediaFormatAudioVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MediaFormatAudioVector() {
    this(pjsua2JNI.new_MediaFormatAudioVector__SWIG_0(), true);
  }

  public MediaFormatAudioVector(long n) {
    this(pjsua2JNI.new_MediaFormatAudioVector__SWIG_1(n), true);
  }

  public long size() {
    return pjsua2JNI.MediaFormatAudioVector_size(swigCPtr, this);
  }

  public long capacity() {
    return pjsua2JNI.MediaFormatAudioVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    pjsua2JNI.MediaFormatAudioVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return pjsua2JNI.MediaFormatAudioVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.MediaFormatAudioVector_clear(swigCPtr, this);
  }

  public void add(MediaFormatAudio x) {
    pjsua2JNI.MediaFormatAudioVector_add(swigCPtr, this, MediaFormatAudio.getCPtr(x), x);
  }

  public MediaFormatAudio get(int i) {
    return new MediaFormatAudio(pjsua2JNI.MediaFormatAudioVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, MediaFormatAudio val) {
    pjsua2JNI.MediaFormatAudioVector_set(swigCPtr, this, i, MediaFormatAudio.getCPtr(val), val);
  }

}
