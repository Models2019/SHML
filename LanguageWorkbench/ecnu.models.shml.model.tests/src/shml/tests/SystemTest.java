/**
 */
package shml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import shml.ShmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemTest extends TestCase {

	/**
	 * The fixture for this System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected shml.System fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemTest.class);
	}

	/**
	 * Constructs a new System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(shml.System fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected shml.System getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ShmlFactory.eINSTANCE.createSystem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SystemTest
