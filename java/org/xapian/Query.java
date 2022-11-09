/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.13
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.xapian;

public class Query {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Query(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Query obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        XapianJNI.delete_Query(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    // For compatibility with the original JNI wrappers.
    public final static op OP_AND = op.OP_AND;
    public final static op OP_OR = op.OP_OR;
    public final static op OP_AND_NOT = op.OP_AND_NOT;
    public final static op OP_XOR = op.OP_XOR;
    public final static op OP_AND_MAYBE = op.OP_AND_MAYBE;
    public final static op OP_FILTER = op.OP_FILTER;
    public final static op OP_NEAR = op.OP_NEAR;
    public final static op OP_PHRASE = op.OP_PHRASE;
    public final static op OP_ELITE_SET = op.OP_ELITE_SET;
    public final static op OP_VALUE_RANGE = op.OP_VALUE_RANGE;

    public final static Query MatchAll = new Query("");
    public final static Query MatchNothing = new Query();

    protected static long[] cArrayUnwrap(Query[] arrayWrapper) {
	long[] cArray = new long[arrayWrapper.length];
	for (int i=0; i<arrayWrapper.length; i++)
	    cArray[i] = Query.getCPtr(arrayWrapper[i]);
	return cArray;
    }

  public Query() {
    this(XapianJNI.new_Query__SWIG_0(), true);
  }

  public Query(String term, long wqf, long pos) {
    this(XapianJNI.new_Query__SWIG_1(term, wqf, pos), true);
  }

  public Query(String term, long wqf) {
    this(XapianJNI.new_Query__SWIG_2(term, wqf), true);
  }

  public Query(String term) {
    this(XapianJNI.new_Query__SWIG_3(term), true);
  }

  public Query(PostingSource source) {
    this(XapianJNI.new_Query__SWIG_4(PostingSource.getCPtr(source), source), true);
  }

  public Query(double factor, Query subquery) {
    this(XapianJNI.new_Query__SWIG_5(factor, Query.getCPtr(subquery), subquery), true);
  }

  public Query(Query.op op_, Query subquery, double factor) {
    this(XapianJNI.new_Query__SWIG_6(op_.swigValue(), Query.getCPtr(subquery), subquery, factor), true);
  }

  public Query(Query.op op_, Query a, Query b) {
    this(XapianJNI.new_Query__SWIG_7(op_.swigValue(), Query.getCPtr(a), a, Query.getCPtr(b), b), true);
  }

  public Query(Query.op op_, String a, String b) {
    this(XapianJNI.new_Query__SWIG_8(op_.swigValue(), a, b), true);
  }

  public Query(Query.op op_, int slot, byte[] range_limit) {
    this(XapianJNI.new_Query__SWIG_9(op_.swigValue(), slot, range_limit), true);
  }

  public Query(Query.op op_, int slot, byte[] range_lower, byte[] range_upper) {
    this(XapianJNI.new_Query__SWIG_10(op_.swigValue(), slot, range_lower, range_upper), true);
  }

  public Query(Query.op op_, String pattern, long max_expansion, int max_type, Query.op combiner) {
    this(XapianJNI.new_Query__SWIG_11(op_.swigValue(), pattern, max_expansion, max_type, combiner.swigValue()), true);
  }

  public Query(Query.op op_, String pattern, long max_expansion, int max_type) {
    this(XapianJNI.new_Query__SWIG_12(op_.swigValue(), pattern, max_expansion, max_type), true);
  }

  public Query(Query.op op_, String pattern, long max_expansion) {
    this(XapianJNI.new_Query__SWIG_13(op_.swigValue(), pattern, max_expansion), true);
  }

  public Query(Query.op op_, String pattern) {
    this(XapianJNI.new_Query__SWIG_14(op_.swigValue(), pattern), true);
  }

  public Query(Query.op op_, Query[] qbegin, long parameter) {
    this(XapianJNI.new_Query__SWIG_17(op_.swigValue(), Query.cArrayUnwrap(qbegin), parameter), true);
  }

  public Query(Query.op op_, Query[] qbegin) {
    this(XapianJNI.new_Query__SWIG_18(op_.swigValue(), Query.cArrayUnwrap(qbegin)), true);
  }

  public Query(Query.op op_, String[] qbegin, long parameter) {
    this(XapianJNI.new_Query__SWIG_19(op_.swigValue(), qbegin, parameter), true);
  }

  public Query(Query.op op_, String[] qbegin) {
    this(XapianJNI.new_Query__SWIG_20(op_.swigValue(), qbegin), true);
  }

  public TermIterator getTermsBegin() {
    return new TermIterator(XapianJNI.Query_getTermsBegin(swigCPtr, this), true);
  }

  public TermIterator getTermsEnd() {
    return new TermIterator(XapianJNI.Query_getTermsEnd(swigCPtr, this), true);
  }

  public TermIterator getUniqueTermsBegin() {
    return new TermIterator(XapianJNI.Query_getUniqueTermsBegin(swigCPtr, this), true);
  }

  public TermIterator getUniqueTermsEnd() {
    return new TermIterator(XapianJNI.Query_getUniqueTermsEnd(swigCPtr, this), true);
  }

  public long getLength() {
    return XapianJNI.Query_getLength(swigCPtr, this);
  }

  public boolean empty() {
    return XapianJNI.Query_empty(swigCPtr, this);
  }

  public byte[] serialise() {
    return XapianJNI.Query_serialise(swigCPtr, this);
  }

  public static Query unserialise(byte[] serialised, Registry reg) {
    return new Query(XapianJNI.Query_unserialise__SWIG_0(serialised, Registry.getCPtr(reg), reg), true);
  }

  public static Query unserialise(byte[] serialised) {
    return new Query(XapianJNI.Query_unserialise__SWIG_1(serialised), true);
  }

  public Query.op getType() {
    return Query.op.swigToEnum(XapianJNI.Query_getType(swigCPtr, this));
  }

  public long getNumSubqueries() {
    return XapianJNI.Query_getNumSubqueries(swigCPtr, this);
  }

  public Query getSubquery(long n) {
    return new Query(XapianJNI.Query_getSubquery(swigCPtr, this, n), true);
  }

  public String toString() {
    return XapianJNI.Query_toString(swigCPtr, this);
  }

  public Query(Query.op op_) {
    this(XapianJNI.new_Query__SWIG_21(op_.swigValue()), true);
  }

  public final static class op {
    public final static Query.op OP_AND = new Query.op("OP_AND", XapianJNI.Query_OP_AND_get());
    public final static Query.op OP_OR = new Query.op("OP_OR", XapianJNI.Query_OP_OR_get());
    public final static Query.op OP_AND_NOT = new Query.op("OP_AND_NOT", XapianJNI.Query_OP_AND_NOT_get());
    public final static Query.op OP_XOR = new Query.op("OP_XOR", XapianJNI.Query_OP_XOR_get());
    public final static Query.op OP_AND_MAYBE = new Query.op("OP_AND_MAYBE", XapianJNI.Query_OP_AND_MAYBE_get());
    public final static Query.op OP_FILTER = new Query.op("OP_FILTER", XapianJNI.Query_OP_FILTER_get());
    public final static Query.op OP_NEAR = new Query.op("OP_NEAR", XapianJNI.Query_OP_NEAR_get());
    public final static Query.op OP_PHRASE = new Query.op("OP_PHRASE", XapianJNI.Query_OP_PHRASE_get());
    public final static Query.op OP_VALUE_RANGE = new Query.op("OP_VALUE_RANGE", XapianJNI.Query_OP_VALUE_RANGE_get());
    public final static Query.op OP_SCALE_WEIGHT = new Query.op("OP_SCALE_WEIGHT", XapianJNI.Query_OP_SCALE_WEIGHT_get());
    public final static Query.op OP_ELITE_SET = new Query.op("OP_ELITE_SET", XapianJNI.Query_OP_ELITE_SET_get());
    public final static Query.op OP_VALUE_GE = new Query.op("OP_VALUE_GE", XapianJNI.Query_OP_VALUE_GE_get());
    public final static Query.op OP_VALUE_LE = new Query.op("OP_VALUE_LE", XapianJNI.Query_OP_VALUE_LE_get());
    public final static Query.op OP_SYNONYM = new Query.op("OP_SYNONYM", XapianJNI.Query_OP_SYNONYM_get());
    public final static Query.op OP_MAX = new Query.op("OP_MAX", XapianJNI.Query_OP_MAX_get());
    public final static Query.op OP_WILDCARD = new Query.op("OP_WILDCARD", XapianJNI.Query_OP_WILDCARD_get());
    public final static Query.op OP_INVALID = new Query.op("OP_INVALID", XapianJNI.Query_OP_INVALID_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static op swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + op.class + " with value " + swigValue);
    }

    private op(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private op(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private op(String swigName, op swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static op[] swigValues = { OP_AND, OP_OR, OP_AND_NOT, OP_XOR, OP_AND_MAYBE, OP_FILTER, OP_NEAR, OP_PHRASE, OP_VALUE_RANGE, OP_SCALE_WEIGHT, OP_ELITE_SET, OP_VALUE_GE, OP_VALUE_LE, OP_SYNONYM, OP_MAX, OP_WILDCARD, OP_INVALID };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static int WILDCARD_LIMIT_ERROR = XapianJNI.Query_WILDCARD_LIMIT_ERROR_get();
  public final static int WILDCARD_LIMIT_FIRST = XapianJNI.Query_WILDCARD_LIMIT_FIRST_get();
  public final static int WILDCARD_LIMIT_MOST_FREQUENT = XapianJNI.Query_WILDCARD_LIMIT_MOST_FREQUENT_get();

}
