/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package eu.fp7.scase.umlrec.internal;


public class UMLrecog {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected UMLrecog(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UMLrecog obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        UMLRecognizerJNI.delete_UMLrecog(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UMLrecog() {
    this(UMLRecognizerJNI.new_UMLrecog(), true);
  }

  public void clear() {
    UMLRecognizerJNI.UMLrecog_clear(swigCPtr, this);
  }

  public void setParameters(boolean isUseCase, boolean showImages, int thresh, double sizeRate, double distNeightborObjects, double coverAreaThr) {
    UMLRecognizerJNI.UMLrecog_setParameters__SWIG_0(swigCPtr, this, isUseCase, showImages, thresh, sizeRate, distNeightborObjects, coverAreaThr);
  }

  public void setParameters(boolean isUseCase, boolean showImages, int thresh, double sizeRate, double distNeightborObjects) {
    UMLRecognizerJNI.UMLrecog_setParameters__SWIG_1(swigCPtr, this, isUseCase, showImages, thresh, sizeRate, distNeightborObjects);
  }

  public void setParameters(boolean isUseCase, boolean showImages, int thresh, double sizeRate) {
    UMLRecognizerJNI.UMLrecog_setParameters__SWIG_2(swigCPtr, this, isUseCase, showImages, thresh, sizeRate);
  }

  public void setParameters(boolean isUseCase, boolean showImages, int thresh) {
    UMLRecognizerJNI.UMLrecog_setParameters__SWIG_3(swigCPtr, this, isUseCase, showImages, thresh);
  }

  public void setParameters(boolean isUseCase, boolean showImages) {
    UMLRecognizerJNI.UMLrecog_setParameters__SWIG_4(swigCPtr, this, isUseCase, showImages);
  }

  public void setParameters(boolean isUseCase) {
    UMLRecognizerJNI.UMLrecog_setParameters__SWIG_5(swigCPtr, this, isUseCase);
  }

  public void setParameters() {
    UMLRecognizerJNI.UMLrecog_setParameters__SWIG_6(swigCPtr, this);
  }

  public boolean setImage(String fileName) {
    return UMLRecognizerJNI.UMLrecog_setImage(swigCPtr, this, fileName);
  }

  public void setTessPath(String pathName) {
    UMLRecognizerJNI.UMLrecog_setTessPath(swigCPtr, this, pathName);
  }

  public int process() {
    return UMLRecognizerJNI.UMLrecog_process(swigCPtr, this);
  }

  public StringList getXMIcontent() {
    return new StringList(UMLRecognizerJNI.UMLrecog_getXMIcontent(swigCPtr, this), true);
  }

}