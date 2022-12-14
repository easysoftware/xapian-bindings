/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.13
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.xapian;

public class LatLongCoords {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LatLongCoords(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LatLongCoords obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        XapianJNI.delete_LatLongCoords(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LatLongCoordsIterator begin() {
    return new LatLongCoordsIterator(XapianJNI.LatLongCoords_begin(swigCPtr, this), true);
  }

  public LatLongCoordsIterator end() {
    return new LatLongCoordsIterator(XapianJNI.LatLongCoords_end(swigCPtr, this), true);
  }

  public long size() {
    return XapianJNI.LatLongCoords_size(swigCPtr, this);
  }

  public boolean empty() {
    return XapianJNI.LatLongCoords_empty(swigCPtr, this);
  }

  public void append(LatLongCoord coord) {
    XapianJNI.LatLongCoords_append(swigCPtr, this, LatLongCoord.getCPtr(coord), coord);
  }

  public LatLongCoords() {
    this(XapianJNI.new_LatLongCoords__SWIG_0(), true);
  }

  public LatLongCoords(LatLongCoord coord) {
    this(XapianJNI.new_LatLongCoords__SWIG_1(LatLongCoord.getCPtr(coord), coord), true);
  }

  public void unserialise(byte[] serialised) {
    XapianJNI.LatLongCoords_unserialise(swigCPtr, this, serialised);
  }

  public byte[] serialise() {
    return XapianJNI.LatLongCoords_serialise(swigCPtr, this);
  }

  public String toString() {
    return XapianJNI.LatLongCoords_toString(swigCPtr, this);
  }

}
