/**
 */
package ecnu.models.xshml.xshmlmt.shml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TemporalGuard#getTcondition <em>Tcondition</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TemporalGuard#getOnclock <em>Onclock</em>}</li>
 * </ul>
 *
 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTemporalGuard()
 * @model
 * @generated
 */
public interface TemporalGuard extends Guard {
	/**
	 * Returns the value of the '<em><b>Tcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tcondition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcondition</em>' attribute.
	 * @see #setTcondition(String)
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTemporalGuard_Tcondition()
	 * @model
	 * @generated
	 */
	String getTcondition();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.TemporalGuard#getTcondition <em>Tcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tcondition</em>' attribute.
	 * @see #getTcondition()
	 * @generated
	 */
	void setTcondition(String value);

	/**
	 * Returns the value of the '<em><b>Onclock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onclock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onclock</em>' reference.
	 * @see #setOnclock(Clock)
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTemporalGuard_Onclock()
	 * @model required="true"
	 * @generated
	 */
	Clock getOnclock();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.TemporalGuard#getOnclock <em>Onclock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onclock</em>' reference.
	 * @see #getOnclock()
	 * @generated
	 */
	void setOnclock(Clock value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean holdstg();

} // TemporalGuard
