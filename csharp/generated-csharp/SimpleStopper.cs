//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.13
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace Xapian {

public class SimpleStopper : Stopper {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;

  internal SimpleStopper(global::System.IntPtr cPtr, bool cMemoryOwn) : base(XapianPINVOKE.SimpleStopper_SWIGUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(SimpleStopper obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~SimpleStopper() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          XapianPINVOKE.delete_SimpleStopper(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public SimpleStopper() : this(XapianPINVOKE.new_SimpleStopper__SWIG_0(), true) {
    if (XapianPINVOKE.SWIGPendingException.Pending) throw XapianPINVOKE.SWIGPendingException.Retrieve();
  }

  public void Add(string word) {
    XapianPINVOKE.SimpleStopper_Add(swigCPtr, word);
    if (XapianPINVOKE.SWIGPendingException.Pending) throw XapianPINVOKE.SWIGPendingException.Retrieve();
  }

  public override bool Apply(string term) {
    bool ret = XapianPINVOKE.SimpleStopper_Apply(swigCPtr, term);
    if (XapianPINVOKE.SWIGPendingException.Pending) throw XapianPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override string GetDescription() {
    string ret = XapianPINVOKE.SimpleStopper_GetDescription(swigCPtr);
    if (XapianPINVOKE.SWIGPendingException.Pending) throw XapianPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public SimpleStopper(string file) : this(XapianPINVOKE.new_SimpleStopper__SWIG_2(file), true) {
    if (XapianPINVOKE.SWIGPendingException.Pending) throw XapianPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
