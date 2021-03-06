/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.scoping.scoping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.scoping.scoping.Chapter;
import org.xtext.example.scoping.scoping.Paragraph;
import org.xtext.example.scoping.scoping.Reference;
import org.xtext.example.scoping.scoping.ScopingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.scoping.scoping.impl.ChapterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.scoping.scoping.impl.ChapterImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.xtext.example.scoping.scoping.impl.ChapterImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link org.xtext.example.scoping.scoping.impl.ChapterImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChapterImpl extends MinimalEObjectImpl.Container implements Chapter
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getChapter() <em>Chapter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChapter()
   * @generated
   * @ordered
   */
  protected EList<Chapter> chapter;

  /**
   * The cached value of the '{@link #getParagraphs() <em>Paragraphs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParagraphs()
   * @generated
   * @ordered
   */
  protected EList<Paragraph> paragraphs;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<Reference> references;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChapterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ScopingPackage.Literals.CHAPTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScopingPackage.CHAPTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Chapter> getChapter()
  {
    if (chapter == null)
    {
      chapter = new EObjectContainmentEList<Chapter>(Chapter.class, this, ScopingPackage.CHAPTER__CHAPTER);
    }
    return chapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Paragraph> getParagraphs()
  {
    if (paragraphs == null)
    {
      paragraphs = new EObjectContainmentEList<Paragraph>(Paragraph.class, this, ScopingPackage.CHAPTER__PARAGRAPHS);
    }
    return paragraphs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Reference> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentEList<Reference>(Reference.class, this, ScopingPackage.CHAPTER__REFERENCES);
    }
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ScopingPackage.CHAPTER__CHAPTER:
        return ((InternalEList<?>)getChapter()).basicRemove(otherEnd, msgs);
      case ScopingPackage.CHAPTER__PARAGRAPHS:
        return ((InternalEList<?>)getParagraphs()).basicRemove(otherEnd, msgs);
      case ScopingPackage.CHAPTER__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ScopingPackage.CHAPTER__NAME:
        return getName();
      case ScopingPackage.CHAPTER__CHAPTER:
        return getChapter();
      case ScopingPackage.CHAPTER__PARAGRAPHS:
        return getParagraphs();
      case ScopingPackage.CHAPTER__REFERENCES:
        return getReferences();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ScopingPackage.CHAPTER__NAME:
        setName((String)newValue);
        return;
      case ScopingPackage.CHAPTER__CHAPTER:
        getChapter().clear();
        getChapter().addAll((Collection<? extends Chapter>)newValue);
        return;
      case ScopingPackage.CHAPTER__PARAGRAPHS:
        getParagraphs().clear();
        getParagraphs().addAll((Collection<? extends Paragraph>)newValue);
        return;
      case ScopingPackage.CHAPTER__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends Reference>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ScopingPackage.CHAPTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScopingPackage.CHAPTER__CHAPTER:
        getChapter().clear();
        return;
      case ScopingPackage.CHAPTER__PARAGRAPHS:
        getParagraphs().clear();
        return;
      case ScopingPackage.CHAPTER__REFERENCES:
        getReferences().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ScopingPackage.CHAPTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScopingPackage.CHAPTER__CHAPTER:
        return chapter != null && !chapter.isEmpty();
      case ScopingPackage.CHAPTER__PARAGRAPHS:
        return paragraphs != null && !paragraphs.isEmpty();
      case ScopingPackage.CHAPTER__REFERENCES:
        return references != null && !references.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ChapterImpl
