/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.13
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.xapian;

public class PostingSource {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PostingSource(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PostingSource obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        XapianJNI.delete_PostingSource(swigCPtr);
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
    XapianJNI.PostingSource_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    XapianJNI.PostingSource_change_ownership(this, swigCPtr, true);
  }

  public PostingSource() {
    this(XapianJNI.new_PostingSource(), true);
    XapianJNI.PostingSource_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public long getTermfreqMin() {
    return XapianJNI.PostingSource_getTermfreqMin(swigCPtr, this);
  }

  public long getTermfreqEst() {
    return XapianJNI.PostingSource_getTermfreqEst(swigCPtr, this);
  }

  public long getTermfreqMax() {
    return XapianJNI.PostingSource_getTermfreqMax(swigCPtr, this);
  }

  public void setMaxweight(double max_weight) {
    XapianJNI.PostingSource_setMaxweight(swigCPtr, this, max_weight);
  }

  public double getMaxweight() {
    return XapianJNI.PostingSource_getMaxweight(swigCPtr, this);
  }

  public double getWeight() {
    return (getClass() == PostingSource.class) ? XapianJNI.PostingSource_getWeight(swigCPtr, this) : XapianJNI.PostingSource_getWeightSwigExplicitPostingSource(swigCPtr, this);
  }

  public long getDocId() {
    return XapianJNI.PostingSource_getDocId(swigCPtr, this);
  }

  public void next(double min_wt) {
    XapianJNI.PostingSource_next(swigCPtr, this, min_wt);
  }

  public void skipTo(long did, double min_wt) {
    if (getClass() == PostingSource.class) XapianJNI.PostingSource_skipTo(swigCPtr, this, did, min_wt); else XapianJNI.PostingSource_skipToSwigExplicitPostingSource(swigCPtr, this, did, min_wt);
  }

  public boolean check(long did, double min_wt) {
    return (getClass() == PostingSource.class) ? XapianJNI.PostingSource_check(swigCPtr, this, did, min_wt) : XapianJNI.PostingSource_checkSwigExplicitPostingSource(swigCPtr, this, did, min_wt);
  }

  public boolean atEnd() {
    return XapianJNI.PostingSource_atEnd(swigCPtr, this);
  }

  public String name() {
    return (getClass() == PostingSource.class) ? XapianJNI.PostingSource_name(swigCPtr, this) : XapianJNI.PostingSource_nameSwigExplicitPostingSource(swigCPtr, this);
  }

  public void init(Database db) {
    XapianJNI.PostingSource_init(swigCPtr, this, Database.getCPtr(db), db);
  }

  public String toString() {
    return (getClass() == PostingSource.class) ? XapianJNI.PostingSource_toString(swigCPtr, this) : XapianJNI.PostingSource_toStringSwigExplicitPostingSource(swigCPtr, this);
  }

  public PostingSource release() {
    long cPtr = XapianJNI.PostingSource_release(swigCPtr, this);
    return (cPtr == 0) ? null : new PostingSource(cPtr, false);
  }

}
