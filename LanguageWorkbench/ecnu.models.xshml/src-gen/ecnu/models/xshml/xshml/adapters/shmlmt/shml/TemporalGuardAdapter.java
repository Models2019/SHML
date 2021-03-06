package ecnu.models.xshml.xshml.adapters.shmlmt.shml;

import ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.TemporalGuard;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import shml.Clock;

@SuppressWarnings("all")
public class TemporalGuardAdapter extends EObjectAdapter<TemporalGuard> implements shml.TemporalGuard {
  private SHMLMTAdaptersFactory adaptersFactory;
  
  public TemporalGuardAdapter() {
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
  public String getTcondition() {
    return adaptee.getTcondition();
  }
  
  @Override
  public void setTcondition(final String o) {
    adaptee.setTcondition(o);
  }
  
  @Override
  public Clock getOnclock() {
    return (Clock) adaptersFactory.createAdapter(adaptee.getOnclock(), eResource);
  }
  
  @Override
  public void setOnclock(final Clock o) {
    if (o != null)
    	adaptee.setOnclock(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.ClockAdapter) o).getAdaptee());
    else adaptee.setOnclock(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String TCONDITION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return shml.ShmlPackage.eINSTANCE.getTemporalGuard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case shml.ShmlPackage.TEMPORAL_GUARD__NAME:
    		return getName();
    	case shml.ShmlPackage.TEMPORAL_GUARD__TCONDITION:
    		return getTcondition();
    	case shml.ShmlPackage.TEMPORAL_GUARD__ONCLOCK:
    		return getOnclock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case shml.ShmlPackage.TEMPORAL_GUARD__NAME:
    		return getName() != NAME_EDEFAULT;
    	case shml.ShmlPackage.TEMPORAL_GUARD__TCONDITION:
    		return getTcondition() != TCONDITION_EDEFAULT;
    	case shml.ShmlPackage.TEMPORAL_GUARD__ONCLOCK:
    		return getOnclock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case shml.ShmlPackage.TEMPORAL_GUARD__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case shml.ShmlPackage.TEMPORAL_GUARD__TCONDITION:
    		setTcondition(
    		(java.lang.String)
    		 newValue);
    		return;
    	case shml.ShmlPackage.TEMPORAL_GUARD__ONCLOCK:
    		setOnclock(
    		(shml.Clock)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
