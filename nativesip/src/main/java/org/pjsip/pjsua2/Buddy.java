/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class Buddy {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Buddy(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Buddy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_Buddy(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    pjsua2JNI.Buddy_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    pjsua2JNI.Buddy_change_ownership(this, swigCPtr, true);
  }

  public Buddy() {
    this(pjsua2JNI.new_Buddy(), true);
    pjsua2JNI.Buddy_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void create(Account acc, BuddyConfig cfg) throws Exception {
    pjsua2JNI.Buddy_create(swigCPtr, this, Account.getCPtr(acc), acc, BuddyConfig.getCPtr(cfg), cfg);
  }

  public boolean isValid() {
    return pjsua2JNI.Buddy_isValid(swigCPtr, this);
  }

  public BuddyInfo getInfo() throws Exception {
    return new BuddyInfo(pjsua2JNI.Buddy_getInfo(swigCPtr, this), true);
  }

  public void subscribePresence(boolean subscribe) throws Exception {
    pjsua2JNI.Buddy_subscribePresence(swigCPtr, this, subscribe);
  }

  public void updatePresence() throws Exception {
    pjsua2JNI.Buddy_updatePresence(swigCPtr, this);
  }

  public void sendInstantMessage(SendInstantMessageParam prm) throws Exception {
    pjsua2JNI.Buddy_sendInstantMessage(swigCPtr, this, SendInstantMessageParam.getCPtr(prm), prm);
  }

  public void sendTypingIndication(SendTypingIndicationParam prm) throws Exception {
    pjsua2JNI.Buddy_sendTypingIndication(swigCPtr, this, SendTypingIndicationParam.getCPtr(prm), prm);
  }

  public void onBuddyState() {
    if (getClass() == Buddy.class) pjsua2JNI.Buddy_onBuddyState(swigCPtr, this); else pjsua2JNI.Buddy_onBuddyStateSwigExplicitBuddy(swigCPtr, this);
  }

  public void onBuddyEvSubState(OnBuddyEvSubStateParam prm) {
    if (getClass() == Buddy.class) pjsua2JNI.Buddy_onBuddyEvSubState(swigCPtr, this, OnBuddyEvSubStateParam.getCPtr(prm), prm); else pjsua2JNI.Buddy_onBuddyEvSubStateSwigExplicitBuddy(swigCPtr, this, OnBuddyEvSubStateParam.getCPtr(prm), prm);
  }

}
