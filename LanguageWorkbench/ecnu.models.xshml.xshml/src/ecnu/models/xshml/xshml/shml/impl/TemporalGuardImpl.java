/**
 */
package ecnu.models.xshml.xshml.shml.impl;

import ecnu.models.xshml.xshml.shml.Clock;
import ecnu.models.xshml.xshml.shml.ShmlPackage;
import ecnu.models.xshml.xshml.shml.TemporalGuard;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TemporalGuardImpl#getTcondition <em>Tcondition</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TemporalGuardImpl#getOnclock <em>Onclock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalGuardImpl extends GuardImpl implements TemporalGuard {
	/**
	 * The default value of the '{@link #getTcondition() <em>Tcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcondition()
	 * @generated
	 * @ordered
	 */
	protected static final String TCONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTcondition() <em>Tcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcondition()
	 * @generated
	 * @ordered
	 */
	protected String tcondition = TCONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnclock() <em>Onclock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnclock()
	 * @generated
	 * @ordered
	 */
	protected Clock onclock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShmlPackage.Literals.TEMPORAL_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTcondition() {
		return tcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTcondition(String newTcondition) {
		String oldTcondition = tcondition;
		tcondition = newTcondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.TEMPORAL_GUARD__TCONDITION, oldTcondition, tcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock getOnclock() {
		if (onclock != null && onclock.eIsProxy()) {
			InternalEObject oldOnclock = (InternalEObject)onclock;
			onclock = (Clock)eResolveProxy(oldOnclock);
			if (onclock != oldOnclock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.TEMPORAL_GUARD__ONCLOCK, oldOnclock, onclock));
			}
		}
		return onclock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock basicGetOnclock() {
		return onclock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnclock(Clock newOnclock) {
		Clock oldOnclock = onclock;
		onclock = newOnclock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.TEMPORAL_GUARD__ONCLOCK, oldOnclock, onclock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean holdstg() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShmlPackage.TEMPORAL_GUARD__TCONDITION:
				return getTcondition();
			case ShmlPackage.TEMPORAL_GUARD__ONCLOCK:
				if (resolve) return getOnclock();
				return basicGetOnclock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShmlPackage.TEMPORAL_GUARD__TCONDITION:
				setTcondition((String)newValue);
				return;
			case ShmlPackage.TEMPORAL_GUARD__ONCLOCK:
				setOnclock((Clock)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ShmlPackage.TEMPORAL_GUARD__TCONDITION:
				setTcondition(TCONDITION_EDEFAULT);
				return;
			case ShmlPackage.TEMPORAL_GUARD__ONCLOCK:
				setOnclock((Clock)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ShmlPackage.TEMPORAL_GUARD__TCONDITION:
				return TCONDITION_EDEFAULT == null ? tcondition != null : !TCONDITION_EDEFAULT.equals(tcondition);
			case ShmlPackage.TEMPORAL_GUARD__ONCLOCK:
				return onclock != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tcondition: ");
		result.append(tcondition);
		result.append(')');
		return result.toString();
	}

} //TemporalGuardImpl
