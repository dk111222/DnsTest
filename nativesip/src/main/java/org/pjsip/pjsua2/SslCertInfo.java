/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class SslCertInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SslCertInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SslCertInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_SslCertInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    pjsua2JNI.SslCertInfo_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return pjsua2JNI.SslCertInfo_version_get(swigCPtr, this);
  }

  public void setSerialNo(SWIGTYPE_p_unsigned_char value) {
    pjsua2JNI.SslCertInfo_serialNo_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getSerialNo() {
    long cPtr = pjsua2JNI.SslCertInfo_serialNo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setSubjectCn(String value) {
    pjsua2JNI.SslCertInfo_subjectCn_set(swigCPtr, this, value);
  }

  public String getSubjectCn() {
    return pjsua2JNI.SslCertInfo_subjectCn_get(swigCPtr, this);
  }

  public void setSubjectInfo(String value) {
    pjsua2JNI.SslCertInfo_subjectInfo_set(swigCPtr, this, value);
  }

  public String getSubjectInfo() {
    return pjsua2JNI.SslCertInfo_subjectInfo_get(swigCPtr, this);
  }

  public void setIssuerCn(String value) {
    pjsua2JNI.SslCertInfo_issuerCn_set(swigCPtr, this, value);
  }

  public String getIssuerCn() {
    return pjsua2JNI.SslCertInfo_issuerCn_get(swigCPtr, this);
  }

  public void setIssuerInfo(String value) {
    pjsua2JNI.SslCertInfo_issuerInfo_set(swigCPtr, this, value);
  }

  public String getIssuerInfo() {
    return pjsua2JNI.SslCertInfo_issuerInfo_get(swigCPtr, this);
  }

  public void setValidityStart(TimeVal value) {
    pjsua2JNI.SslCertInfo_validityStart_set(swigCPtr, this, TimeVal.getCPtr(value), value);
  }

  public TimeVal getValidityStart() {
    long cPtr = pjsua2JNI.SslCertInfo_validityStart_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TimeVal(cPtr, false);
  }

  public void setValidityEnd(TimeVal value) {
    pjsua2JNI.SslCertInfo_validityEnd_set(swigCPtr, this, TimeVal.getCPtr(value), value);
  }

  public TimeVal getValidityEnd() {
    long cPtr = pjsua2JNI.SslCertInfo_validityEnd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TimeVal(cPtr, false);
  }

  public void setValidityGmt(boolean value) {
    pjsua2JNI.SslCertInfo_validityGmt_set(swigCPtr, this, value);
  }

  public boolean getValidityGmt() {
    return pjsua2JNI.SslCertInfo_validityGmt_get(swigCPtr, this);
  }

  public void setSubjectAltName(SslCertNameVector value) {
    pjsua2JNI.SslCertInfo_subjectAltName_set(swigCPtr, this, SslCertNameVector.getCPtr(value), value);
  }

  public SslCertNameVector getSubjectAltName() {
    long cPtr = pjsua2JNI.SslCertInfo_subjectAltName_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SslCertNameVector(cPtr, false);
  }

  public void setRaw(String value) {
    pjsua2JNI.SslCertInfo_raw_set(swigCPtr, this, value);
  }

  public String getRaw() {
    return pjsua2JNI.SslCertInfo_raw_get(swigCPtr, this);
  }

  public SslCertInfo() {
    this(pjsua2JNI.new_SslCertInfo(), true);
  }

  public boolean isEmpty() {
    return pjsua2JNI.SslCertInfo_isEmpty(swigCPtr, this);
  }

}
