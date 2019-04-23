package ecnu.models.xshml.xshml.adapters.xshmlmt.shml;

import ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.Interval;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntervalAdapter extends EObjectAdapter<Interval> implements ecnu.models.xshml.xshmlmt.shml.Interval {
  private XSHMLMTAdaptersFactory adaptersFactory;
  
  public IntervalAdapter() {
    super(ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory.getInstance());
    adaptersFactory = ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public float getLeft() {
    return adaptee.getLeft();
  }
  
  @Override
  public void setLeft(final float o) {
    adaptee.setLeft(o);
  }
  
  @Override
  public float getRight() {
    return adaptee.getRight();
  }
  
  @Override
  public void setRight(final float o) {
    adaptee.setRight(o);
  }
  
  @Override
  public float getSubinterval() {
    return adaptee.getSubinterval();
  }
  
  @Override
  public void setSubinterval(final float o) {
    adaptee.setSubinterval(o);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static float LEFT_EDEFAULT = 0.0F;
  
  protected final static float RIGHT_EDEFAULT = 0.0F;
  
  protected final static float SUBINTERVAL_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return ecnu.models.xshml.xshmlmt.shml.ShmlPackage.eINSTANCE.getInterval();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.INTERVAL__NAME:
    		return getName();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.INTERVAL__LEFT:
    		return new java.lang.Float(getLeft());
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.INTERVAL__RIGHT:
    		return new java.lang.Float(getRight());
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.INTERVAL__SUBINTERVAL:
    		return new java.lang.Float(getSubinterval());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.INTERVAL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.INTERVAL__LEFT:
    		return getLeft() != LEFT_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.INTERVAL__RIGHT:
    		return getRight() != RIGHT_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.INTERVAL__SUBINTERVAL:
    		return getSubinterval() != SUBINTERVAL_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.INTERVAL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.INTERVAL__LEFT:
    		setLeft(((java.lang.Float) newValue).floatValue());
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.INTERVAL__RIGHT:
    		setRight(((java.lang.Float) newValue).floatValue());
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.INTERVAL__SUBINTERVAL:
    		setSubinterval(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
