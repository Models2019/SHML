package ecnu.models.xshml.xshml.adapters.xshmlmt;

import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ActionAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ClockAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ComTransitionAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ConditionAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.DeVariableAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.EvaluateGuardAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.EventAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ExpoDistributionAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.FrightAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.FunctionAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.GuardAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.IndeVariableAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.IntervalAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ODEAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ProbTransitionAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.StateAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.SystemAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TSHSAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TemporalGuardAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TransitionAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.UnifDistributionAdapter;
import ecnu.models.xshml.xshml.adapters.xshmlmt.shml.VariableAdapter;
import ecnu.models.xshml.xshml.shml.Action;
import ecnu.models.xshml.xshml.shml.Clock;
import ecnu.models.xshml.xshml.shml.ComTransition;
import ecnu.models.xshml.xshml.shml.Condition;
import ecnu.models.xshml.xshml.shml.DeVariable;
import ecnu.models.xshml.xshml.shml.EvaluateGuard;
import ecnu.models.xshml.xshml.shml.Event;
import ecnu.models.xshml.xshml.shml.ExpoDistribution;
import ecnu.models.xshml.xshml.shml.Fright;
import ecnu.models.xshml.xshml.shml.Function;
import ecnu.models.xshml.xshml.shml.Guard;
import ecnu.models.xshml.xshml.shml.IndeVariable;
import ecnu.models.xshml.xshml.shml.Interval;
import ecnu.models.xshml.xshml.shml.ODE;
import ecnu.models.xshml.xshml.shml.ProbTransition;
import ecnu.models.xshml.xshml.shml.State;
import ecnu.models.xshml.xshml.shml.TSHS;
import ecnu.models.xshml.xshml.shml.TemporalGuard;
import ecnu.models.xshml.xshml.shml.Transition;
import ecnu.models.xshml.xshml.shml.UnifDistribution;
import ecnu.models.xshml.xshml.shml.Variable;
import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class XSHMLMTAdaptersFactory implements AdaptersFactory {
  private static XSHMLMTAdaptersFactory instance;
  
  public static XSHMLMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XSHMLMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof ecnu.models.xshml.xshml.shml.System){
    	return createSystemAdapter((ecnu.models.xshml.xshml.shml.System) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.TSHS){
    	return createTSHSAdapter((ecnu.models.xshml.xshml.shml.TSHS) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.Variable){
    	return createVariableAdapter((ecnu.models.xshml.xshml.shml.Variable) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.Clock){
    	return createClockAdapter((ecnu.models.xshml.xshml.shml.Clock) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.Event){
    	return createEventAdapter((ecnu.models.xshml.xshml.shml.Event) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.TemporalGuard){
    	return createTemporalGuardAdapter((ecnu.models.xshml.xshml.shml.TemporalGuard) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.EvaluateGuard){
    	return createEvaluateGuardAdapter((ecnu.models.xshml.xshml.shml.EvaluateGuard) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.State){
    	return createStateAdapter((ecnu.models.xshml.xshml.shml.State) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.ComTransition){
    	return createComTransitionAdapter((ecnu.models.xshml.xshml.shml.ComTransition) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.ProbTransition){
    	return createProbTransitionAdapter((ecnu.models.xshml.xshml.shml.ProbTransition) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.Function){
    	return createFunctionAdapter((ecnu.models.xshml.xshml.shml.Function) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.IndeVariable){
    	return createIndeVariableAdapter((ecnu.models.xshml.xshml.shml.IndeVariable) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.DeVariable){
    	return createDeVariableAdapter((ecnu.models.xshml.xshml.shml.DeVariable) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.Fright){
    	return createFrightAdapter((ecnu.models.xshml.xshml.shml.Fright) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.ODE){
    	return createODEAdapter((ecnu.models.xshml.xshml.shml.ODE) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.Condition){
    	return createConditionAdapter((ecnu.models.xshml.xshml.shml.Condition) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.Interval){
    	return createIntervalAdapter((ecnu.models.xshml.xshml.shml.Interval) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.ExpoDistribution){
    	return createExpoDistributionAdapter((ecnu.models.xshml.xshml.shml.ExpoDistribution) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.Action){
    	return createActionAdapter((ecnu.models.xshml.xshml.shml.Action) o, res);
    }
    if (o instanceof ecnu.models.xshml.xshml.shml.UnifDistribution){
    	return createUnifDistributionAdapter((ecnu.models.xshml.xshml.shml.UnifDistribution) o, res);
    }
    
    return null;
  }
  
  public SystemAdapter createSystemAdapter(final ecnu.models.xshml.xshml.shml.System adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.SystemAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.SystemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.SystemAdapter) adapter;
    }
  }
  
  public TSHSAdapter createTSHSAdapter(final TSHS adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TSHSAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TSHSAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TSHSAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.VariableAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.VariableAdapter) adapter;
    }
  }
  
  public ClockAdapter createClockAdapter(final Clock adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ClockAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ClockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ClockAdapter) adapter;
    }
  }
  
  public EventAdapter createEventAdapter(final Event adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.EventAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.EventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.EventAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TransitionAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TransitionAdapter) adapter;
    }
  }
  
  public GuardAdapter createGuardAdapter(final Guard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.GuardAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.GuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.GuardAdapter) adapter;
    }
  }
  
  public TemporalGuardAdapter createTemporalGuardAdapter(final TemporalGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TemporalGuardAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TemporalGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TemporalGuardAdapter) adapter;
    }
  }
  
  public EvaluateGuardAdapter createEvaluateGuardAdapter(final EvaluateGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.EvaluateGuardAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.EvaluateGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.EvaluateGuardAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.StateAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.StateAdapter) adapter;
    }
  }
  
  public ComTransitionAdapter createComTransitionAdapter(final ComTransition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ComTransitionAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ComTransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ComTransitionAdapter) adapter;
    }
  }
  
  public ProbTransitionAdapter createProbTransitionAdapter(final ProbTransition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ProbTransitionAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ProbTransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ProbTransitionAdapter) adapter;
    }
  }
  
  public FunctionAdapter createFunctionAdapter(final Function adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.FunctionAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.FunctionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.FunctionAdapter) adapter;
    }
  }
  
  public IndeVariableAdapter createIndeVariableAdapter(final IndeVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.IndeVariableAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.IndeVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.IndeVariableAdapter) adapter;
    }
  }
  
  public DeVariableAdapter createDeVariableAdapter(final DeVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.DeVariableAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.DeVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.DeVariableAdapter) adapter;
    }
  }
  
  public FrightAdapter createFrightAdapter(final Fright adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.FrightAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.FrightAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.FrightAdapter) adapter;
    }
  }
  
  public ODEAdapter createODEAdapter(final ODE adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ODEAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ODEAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ODEAdapter) adapter;
    }
  }
  
  public ConditionAdapter createConditionAdapter(final Condition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ConditionAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ConditionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ConditionAdapter) adapter;
    }
  }
  
  public IntervalAdapter createIntervalAdapter(final Interval adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.IntervalAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.IntervalAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.IntervalAdapter) adapter;
    }
  }
  
  public ExpoDistributionAdapter createExpoDistributionAdapter(final ExpoDistribution adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ExpoDistributionAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ExpoDistributionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ExpoDistributionAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ActionAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ActionAdapter) adapter;
    }
  }
  
  public UnifDistributionAdapter createUnifDistributionAdapter(final UnifDistribution adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.UnifDistributionAdapter) adapter;
    else {
    	adapter = new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.UnifDistributionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ecnu.models.xshml.xshml.adapters.xshmlmt.shml.UnifDistributionAdapter) adapter;
    }
  }
}
