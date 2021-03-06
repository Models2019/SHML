/**
 */
package shml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shml.Interval#getName <em>Name</em>}</li>
 *   <li>{@link shml.Interval#getLeft <em>Left</em>}</li>
 *   <li>{@link shml.Interval#getRight <em>Right</em>}</li>
 *   <li>{@link shml.Interval#getSubinterval <em>Subinterval</em>}</li>
 * </ul>
 *
 * @see shml.ShmlPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see shml.ShmlPackage#getInterval_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link shml.Interval#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' attribute.
	 * @see #setLeft(float)
	 * @see shml.ShmlPackage#getInterval_Left()
	 * @model
	 * @generated
	 */
	float getLeft();

	/**
	 * Sets the value of the '{@link shml.Interval#getLeft <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' attribute.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(float value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see #setRight(float)
	 * @see shml.ShmlPackage#getInterval_Right()
	 * @model
	 * @generated
	 */
	float getRight();

	/**
	 * Sets the value of the '{@link shml.Interval#getRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(float value);

	/**
	 * Returns the value of the '<em><b>Subinterval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subinterval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subinterval</em>' attribute.
	 * @see #setSubinterval(float)
	 * @see shml.ShmlPackage#getInterval_Subinterval()
	 * @model
	 * @generated
	 */
	float getSubinterval();

	/**
	 * Sets the value of the '{@link shml.Interval#getSubinterval <em>Subinterval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subinterval</em>' attribute.
	 * @see #getSubinterval()
	 * @generated
	 */
	void setSubinterval(float value);

} // Interval
