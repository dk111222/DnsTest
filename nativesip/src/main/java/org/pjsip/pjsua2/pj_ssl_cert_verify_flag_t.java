/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pj_ssl_cert_verify_flag_t {
  public final static pj_ssl_cert_verify_flag_t PJ_SSL_CERT_ESUCCESS = new pj_ssl_cert_verify_flag_t("PJ_SSL_CERT_ESUCCESS", pjsua2JNI.PJ_SSL_CERT_ESUCCESS_get());
  public final static pj_ssl_cert_verify_flag_t PJ_SSL_CERT_EISSUER_NOT_FOUND = new pj_ssl_cert_verify_flag_t("PJ_SSL_CERT_EISSUER_NOT_FOUND", pjsua2JNI.PJ_SSL_CERT_EISSUER_NOT_FOUND_get());
  public final static pj_ssl_cert_verify_flag_t PJ_SSL_CERT_EUNTRUSTED = new pj_ssl_cert_verify_flag_t("PJ_SSL_CERT_EUNTRUSTED", pjsua2JNI.PJ_SSL_CERT_EUNTRUSTED_get());
  public final static pj_ssl_cert_verify_flag_t PJ_SSL_CERT_EVALIDITY_PERIOD = new pj_ssl_cert_verify_flag_t("PJ_SSL_CERT_EVALIDITY_PERIOD", pjsua2JNI.PJ_SSL_CERT_EVALIDITY_PERIOD_get());
  public final static pj_ssl_cert_verify_flag_t PJ_SSL_CERT_EINVALID_FORMAT = new pj_ssl_cert_verify_flag_t("PJ_SSL_CERT_EINVALID_FORMAT", pjsua2JNI.PJ_SSL_CERT_EINVALID_FORMAT_get());
  public final static pj_ssl_cert_verify_flag_t PJ_SSL_CERT_EINVALID_PURPOSE = new pj_ssl_cert_verify_flag_t("PJ_SSL_CERT_EINVALID_PURPOSE", pjsua2JNI.PJ_SSL_CERT_EINVALID_PURPOSE_get());
  public final static pj_ssl_cert_verify_flag_t PJ_SSL_CERT_EISSUER_MISMATCH = new pj_ssl_cert_verify_flag_t("PJ_SSL_CERT_EISSUER_MISMATCH", pjsua2JNI.PJ_SSL_CERT_EISSUER_MISMATCH_get());
  public final static pj_ssl_cert_verify_flag_t PJ_SSL_CERT_ECRL_FAILURE = new pj_ssl_cert_verify_flag_t("PJ_SSL_CERT_ECRL_FAILURE", pjsua2JNI.PJ_SSL_CERT_ECRL_FAILURE_get());
  public final static pj_ssl_cert_verify_flag_t PJ_SSL_CERT_EREVOKED = new pj_ssl_cert_verify_flag_t("PJ_SSL_CERT_EREVOKED", pjsua2JNI.PJ_SSL_CERT_EREVOKED_get());
  public final static pj_ssl_cert_verify_flag_t PJ_SSL_CERT_ECHAIN_TOO_LONG = new pj_ssl_cert_verify_flag_t("PJ_SSL_CERT_ECHAIN_TOO_LONG", pjsua2JNI.PJ_SSL_CERT_ECHAIN_TOO_LONG_get());
  public final static pj_ssl_cert_verify_flag_t PJ_SSL_CERT_EIDENTITY_NOT_MATCH = new pj_ssl_cert_verify_flag_t("PJ_SSL_CERT_EIDENTITY_NOT_MATCH", pjsua2JNI.PJ_SSL_CERT_EIDENTITY_NOT_MATCH_get());
  public final static pj_ssl_cert_verify_flag_t PJ_SSL_CERT_EUNKNOWN = new pj_ssl_cert_verify_flag_t("PJ_SSL_CERT_EUNKNOWN", pjsua2JNI.PJ_SSL_CERT_EUNKNOWN_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pj_ssl_cert_verify_flag_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pj_ssl_cert_verify_flag_t.class + " with value " + swigValue);
  }

  private pj_ssl_cert_verify_flag_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pj_ssl_cert_verify_flag_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pj_ssl_cert_verify_flag_t(String swigName, pj_ssl_cert_verify_flag_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pj_ssl_cert_verify_flag_t[] swigValues = { PJ_SSL_CERT_ESUCCESS, PJ_SSL_CERT_EISSUER_NOT_FOUND, PJ_SSL_CERT_EUNTRUSTED, PJ_SSL_CERT_EVALIDITY_PERIOD, PJ_SSL_CERT_EINVALID_FORMAT, PJ_SSL_CERT_EINVALID_PURPOSE, PJ_SSL_CERT_EISSUER_MISMATCH, PJ_SSL_CERT_ECRL_FAILURE, PJ_SSL_CERT_EREVOKED, PJ_SSL_CERT_ECHAIN_TOO_LONG, PJ_SSL_CERT_EIDENTITY_NOT_MATCH, PJ_SSL_CERT_EUNKNOWN };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

