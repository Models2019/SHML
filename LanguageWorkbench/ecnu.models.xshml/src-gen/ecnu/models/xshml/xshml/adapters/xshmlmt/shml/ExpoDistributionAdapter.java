package ecnu.models.xshml.xshml.adapters.xshmlmt.shml;

import ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.ExpoDistribution;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ExpoDistributionAdapter extends EObjectAdapter<ExpoDistribution> implements ecnu.models.xshml.xshmlmt.shml.ExpoDistribution {
  private XSHMLMTAdaptersFactory adaptersFactory;
  
  public ExpoDistributionAdapter() {
    super(ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory.getInstance());
    adaptersFactory = ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public float getLambda() {
    return adaptee.getLambda();
  }
  
  @Override
  public void setLambda(final float o) {
    adaptee.setLambda(o);
  }
  
  protected final static float LAMBDA_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return ecnu.models.xshml.xshmlmt.shml.ShmlPackage.eINSTANCE.getExpoDistribution();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EXPO_DISTRIBUTION__LAMBDA:
    		return new java.lang.Float(getLambda());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EXPO_DISTRIBUTION__LAMBDA:
    		return getLambda() != LAMBDA_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EXPO_DISTRIBUTION__LAMBDA:
    		setLambda(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
