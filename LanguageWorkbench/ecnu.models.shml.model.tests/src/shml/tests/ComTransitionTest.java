/**
 */
package shml.tests;

import junit.textui.TestRunner;

import shml.ComTransition;
import shml.ShmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Com Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComTransitionTest extends TransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComTransitionTest.class);
	}

	/**
	 * Constructs a new Com Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Com Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComTransition getFixture() {
		return (ComTransition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ShmlFactory.eINSTANCE.createComTransition());
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

} //ComTransitionTest
