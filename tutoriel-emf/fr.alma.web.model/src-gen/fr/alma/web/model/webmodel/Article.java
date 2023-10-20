/**
 */
package fr.alma.web.model.webmodel;

import java.time.LocalDateTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.alma.web.model.webmodel.Article#getContents <em>Contents</em>}</li>
 *   <li>{@link fr.alma.web.model.webmodel.Article#getAuthor <em>Author</em>}</li>
 *   <li>{@link fr.alma.web.model.webmodel.Article#getLabels <em>Labels</em>}</li>
 *   <li>{@link fr.alma.web.model.webmodel.Article#getCreated <em>Created</em>}</li>
 * </ul>
 *
 * @see fr.alma.web.model.webmodel.WebmodelPackage#getArticle()
 * @model
 * @generated
 */
public interface Article extends EObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' attribute.
	 * @see #setContents(String)
	 * @see fr.alma.web.model.webmodel.WebmodelPackage#getArticle_Contents()
	 * @model required="true"
	 * @generated
	 */
	String getContents();

	/**
	 * Sets the value of the '{@link fr.alma.web.model.webmodel.Article#getContents <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' attribute.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see fr.alma.web.model.webmodel.WebmodelPackage#getArticle_Author()
	 * @model required="true"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link fr.alma.web.model.webmodel.Article#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference list.
	 * The list contents are of type {@link fr.alma.web.model.webmodel.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference list.
	 * @see fr.alma.web.model.webmodel.WebmodelPackage#getArticle_Labels()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(LocalDateTime)
	 * @see fr.alma.web.model.webmodel.WebmodelPackage#getArticle_Created()
	 * @model dataType="fr.alma.web.model.webmodel.DateTime" required="true"
	 * @generated
	 */
	LocalDateTime getCreated();

	/**
	 * Sets the value of the '{@link fr.alma.web.model.webmodel.Article#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(LocalDateTime value);

} // Article
