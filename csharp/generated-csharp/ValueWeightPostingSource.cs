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

public class ValueWeightPostingSource : ValuePostingSource {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;

  internal ValueWeightPostingSource(global::System.IntPtr cPtr, bool cMemoryOwn) : base(XapianPINVOKE.ValueWeightPostingSource_SWIGUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(ValueWeightPostingSource obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~ValueWeightPostingSource() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          XapianPINVOKE.delete_ValueWeightPostingSource(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public ValueWeightPostingSource(uint slot_) : this(XapianPINVOKE.new_ValueWeightPostingSource(slot_), true) {
    if (XapianPINVOKE.SWIGPendingException.Pending) throw XapianPINVOKE.SWIGPendingException.Retrieve();
    SwigDirectorConnect();
  }

  public override double GetWeight() {
    double ret = (SwigDerivedClassHasMethod("GetWeight", swigMethodTypes3) ? XapianPINVOKE.ValueWeightPostingSource_GetWeightSwigExplicitValueWeightPostingSource(swigCPtr) : XapianPINVOKE.ValueWeightPostingSource_GetWeight(swigCPtr));
    if (XapianPINVOKE.SWIGPendingException.Pending) throw XapianPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override string Name() {
    string ret = (SwigDerivedClassHasMethod("Name", swigMethodTypes9) ? XapianPINVOKE.ValueWeightPostingSource_NameSwigExplicitValueWeightPostingSource(swigCPtr) : XapianPINVOKE.ValueWeightPostingSource_Name(swigCPtr));
    if (XapianPINVOKE.SWIGPendingException.Pending) throw XapianPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override void Init(Database db_) {
    if (SwigDerivedClassHasMethod("Init", swigMethodTypes10)) XapianPINVOKE.ValueWeightPostingSource_InitSwigExplicitValueWeightPostingSource(swigCPtr, Database.getCPtr(db_)); else XapianPINVOKE.ValueWeightPostingSource_Init(swigCPtr, Database.getCPtr(db_));
    if (XapianPINVOKE.SWIGPendingException.Pending) throw XapianPINVOKE.SWIGPendingException.Retrieve();
  }

  public override string GetDescription() {
    string ret = (SwigDerivedClassHasMethod("GetDescription", swigMethodTypes11) ? XapianPINVOKE.ValueWeightPostingSource_GetDescriptionSwigExplicitValueWeightPostingSource(swigCPtr) : XapianPINVOKE.ValueWeightPostingSource_GetDescription(swigCPtr));
    if (XapianPINVOKE.SWIGPendingException.Pending) throw XapianPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  private void SwigDirectorConnect() {
    if (SwigDerivedClassHasMethod("GetTermfreqMin", swigMethodTypes0))
      swigDelegate0 = new SwigDelegateValueWeightPostingSource_0(SwigDirectorGetTermfreqMin);
    if (SwigDerivedClassHasMethod("GetTermfreqEst", swigMethodTypes1))
      swigDelegate1 = new SwigDelegateValueWeightPostingSource_1(SwigDirectorGetTermfreqEst);
    if (SwigDerivedClassHasMethod("GetTermfreqMax", swigMethodTypes2))
      swigDelegate2 = new SwigDelegateValueWeightPostingSource_2(SwigDirectorGetTermfreqMax);
    if (SwigDerivedClassHasMethod("GetWeight", swigMethodTypes3))
      swigDelegate3 = new SwigDelegateValueWeightPostingSource_3(SwigDirectorGetWeight);
    if (SwigDerivedClassHasMethod("GetDocId", swigMethodTypes4))
      swigDelegate4 = new SwigDelegateValueWeightPostingSource_4(SwigDirectorGetDocId);
    if (SwigDerivedClassHasMethod("Next", swigMethodTypes5))
      swigDelegate5 = new SwigDelegateValueWeightPostingSource_5(SwigDirectorNext);
    if (SwigDerivedClassHasMethod("SkipTo", swigMethodTypes6))
      swigDelegate6 = new SwigDelegateValueWeightPostingSource_6(SwigDirectorSkipTo);
    if (SwigDerivedClassHasMethod("Check", swigMethodTypes7))
      swigDelegate7 = new SwigDelegateValueWeightPostingSource_7(SwigDirectorCheck);
    if (SwigDerivedClassHasMethod("AtEnd", swigMethodTypes8))
      swigDelegate8 = new SwigDelegateValueWeightPostingSource_8(SwigDirectorAtEnd);
    if (SwigDerivedClassHasMethod("Name", swigMethodTypes9))
      swigDelegate9 = new SwigDelegateValueWeightPostingSource_9(SwigDirectorName);
    if (SwigDerivedClassHasMethod("Init", swigMethodTypes10))
      swigDelegate10 = new SwigDelegateValueWeightPostingSource_10(SwigDirectorInit);
    if (SwigDerivedClassHasMethod("GetDescription", swigMethodTypes11))
      swigDelegate11 = new SwigDelegateValueWeightPostingSource_11(SwigDirectorGetDescription);
    XapianPINVOKE.ValueWeightPostingSource_director_connect(swigCPtr, swigDelegate0, swigDelegate1, swigDelegate2, swigDelegate3, swigDelegate4, swigDelegate5, swigDelegate6, swigDelegate7, swigDelegate8, swigDelegate9, swigDelegate10, swigDelegate11);
  }

  private bool SwigDerivedClassHasMethod(string methodName, global::System.Type[] methodTypes) {
    global::System.Reflection.MethodInfo methodInfo = this.GetType().GetMethod(methodName, global::System.Reflection.BindingFlags.Public | global::System.Reflection.BindingFlags.NonPublic | global::System.Reflection.BindingFlags.Instance, null, methodTypes, null);
    bool hasDerivedMethod = methodInfo.DeclaringType.IsSubclassOf(typeof(ValueWeightPostingSource));
    return hasDerivedMethod;
  }

  private uint SwigDirectorGetTermfreqMin() {
    return GetTermfreqMin();
  }

  private uint SwigDirectorGetTermfreqEst() {
    return GetTermfreqEst();
  }

  private uint SwigDirectorGetTermfreqMax() {
    return GetTermfreqMax();
  }

  private double SwigDirectorGetWeight() {
    return GetWeight();
  }

  private uint SwigDirectorGetDocId() {
    return GetDocId();
  }

  private void SwigDirectorNext(double min_wt) {
    Next(min_wt);
  }

  private void SwigDirectorSkipTo(uint min_docid, double min_wt) {
    SkipTo(min_docid, min_wt);
  }

  private bool SwigDirectorCheck(uint min_docid, double min_wt) {
    return Check(min_docid, min_wt);
  }

  private bool SwigDirectorAtEnd() {
    return AtEnd();
  }

  private string SwigDirectorName() {
    return Name();
  }

  private void SwigDirectorInit(global::System.IntPtr db_) {
    Init(new Database(db_, false));
  }

  private string SwigDirectorGetDescription() {
    return GetDescription();
  }

  public delegate uint SwigDelegateValueWeightPostingSource_0();
  public delegate uint SwigDelegateValueWeightPostingSource_1();
  public delegate uint SwigDelegateValueWeightPostingSource_2();
  public delegate double SwigDelegateValueWeightPostingSource_3();
  public delegate uint SwigDelegateValueWeightPostingSource_4();
  public delegate void SwigDelegateValueWeightPostingSource_5(double min_wt);
  public delegate void SwigDelegateValueWeightPostingSource_6(uint min_docid, double min_wt);
  public delegate bool SwigDelegateValueWeightPostingSource_7(uint min_docid, double min_wt);
  public delegate bool SwigDelegateValueWeightPostingSource_8();
  public delegate string SwigDelegateValueWeightPostingSource_9();
  public delegate void SwigDelegateValueWeightPostingSource_10(global::System.IntPtr db_);
  public delegate string SwigDelegateValueWeightPostingSource_11();

  private SwigDelegateValueWeightPostingSource_0 swigDelegate0;
  private SwigDelegateValueWeightPostingSource_1 swigDelegate1;
  private SwigDelegateValueWeightPostingSource_2 swigDelegate2;
  private SwigDelegateValueWeightPostingSource_3 swigDelegate3;
  private SwigDelegateValueWeightPostingSource_4 swigDelegate4;
  private SwigDelegateValueWeightPostingSource_5 swigDelegate5;
  private SwigDelegateValueWeightPostingSource_6 swigDelegate6;
  private SwigDelegateValueWeightPostingSource_7 swigDelegate7;
  private SwigDelegateValueWeightPostingSource_8 swigDelegate8;
  private SwigDelegateValueWeightPostingSource_9 swigDelegate9;
  private SwigDelegateValueWeightPostingSource_10 swigDelegate10;
  private SwigDelegateValueWeightPostingSource_11 swigDelegate11;

  private static global::System.Type[] swigMethodTypes0 = new global::System.Type[] {  };
  private static global::System.Type[] swigMethodTypes1 = new global::System.Type[] {  };
  private static global::System.Type[] swigMethodTypes2 = new global::System.Type[] {  };
  private static global::System.Type[] swigMethodTypes3 = new global::System.Type[] {  };
  private static global::System.Type[] swigMethodTypes4 = new global::System.Type[] {  };
  private static global::System.Type[] swigMethodTypes5 = new global::System.Type[] { typeof(double) };
  private static global::System.Type[] swigMethodTypes6 = new global::System.Type[] { typeof(uint), typeof(double) };
  private static global::System.Type[] swigMethodTypes7 = new global::System.Type[] { typeof(uint), typeof(double) };
  private static global::System.Type[] swigMethodTypes8 = new global::System.Type[] {  };
  private static global::System.Type[] swigMethodTypes9 = new global::System.Type[] {  };
  private static global::System.Type[] swigMethodTypes10 = new global::System.Type[] { typeof(Database) };
  private static global::System.Type[] swigMethodTypes11 = new global::System.Type[] {  };
}

}
