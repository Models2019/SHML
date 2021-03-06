package ecnu.models.xshml.xshml.adapters.shmlmt.shml;

import ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.Variable;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class VariableAdapter extends EObjectAdapter<Variable> implements shml.Variable {
  private SHMLMTAdaptersFactory adaptersFactory;
  
  public VariableAdapter() {
    super(ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory.getInstance());
    adaptersFactory = ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory.getInstance();
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
  public float getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final float o) {
    adaptee.setValue(o);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static float VALUE_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return shml.ShmlPackage.eINSTANCE.getVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case shml.ShmlPackage.VARIABLE__NAME:
    		return getName();
    	case shml.ShmlPackage.VARIABLE__VALUE:
    		return new java.lang.Float(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case shml.ShmlPackage.VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case shml.ShmlPackage.VARIABLE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case shml.ShmlPackage.VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case shml.ShmlPackage.VARIABLE__VALUE:
    		setValue(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
