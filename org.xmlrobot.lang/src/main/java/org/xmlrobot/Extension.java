package org.xmlrobot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Maps a java property to an XML extension derived from property name.
 *
 * <p> <b>Usage</b>
 * <p>
 * {@code @Extension} annotation can be used with the following program
 * elements:
 * <ul>
 *   <li> a java property </li>
 *   <li> non static, non transient field </li>
 * </ul>
 *
 * The usage is subject to the following constraints:
 * <ul>
 *   <li> This annotation can be used with following annotations:
 *            {@link Value},
 * </ul>
 *
 * <p>
 * A java property, when annotated with @Extension annotation
 * is mapped to a local element in the XML Schema complex type to
 * which the containing class is mapped.
 *
 * <p>
 * <b>Example 1: </b> Map a public non static non final field to local
 * element
 * <pre>
 *     //Example: Code fragment
 *     public class USPrice {
 *        {@literal @}Extension(name="itemprice")
 *         public java.math.BigDecimal price;
 *     }
 * {@code
 *
 *     <!-- Example: Local XML Schema element -->
 *     <xs:complexType name="USPrice"/>
 *       <xs:sequence>
 *         <xs:element name="itemprice" type="xs:decimal" minOccurs="0"/>
 *       </sequence>
 *     </xs:complexType>
 *   }</pre>
 * <p>
 *
 * <b> Example 2: </b> Map a field to a nillable element.
 *   <pre>
 *     //Example: Code fragment
 *     public class USPrice {
 *        {@literal @}Extension(nillable=true)
 *         public java.math.BigDecimal price;
 *     }
 * {@code
 *
 *     <!-- Example: Local XML Schema element -->
 *     <xs:complexType name="USPrice">
 *       <xs:sequence>
 *         <xs:element name="price" type="xs:decimal" nillable="true" minOccurs="0"/>
 *       </sequence>
 *     </xs:complexType>
 *   }</pre>
 * <p>
 * <b> Example 3: </b> Map a field to a nillable, required element.
 *   <pre>
 *     //Example: Code fragment
 *     public class USPrice {
 *        {@literal @}Extension(nillable=true, required=true)
 *         public java.math.BigDecimal price;
 *     }
 * {@code
 *
 *     <!-- Example: Local XML Schema element -->
 *     <xs:complexType name="USPrice">
 *       <xs:sequence>
 *         <xs:element name="price" type="xs:decimal" nillable="true" minOccurs="1"/>
 *       </sequence>
 *     </xs:complexType>
 *   }</pre>
 *
 * <p> <b>Example 4: </b>Map a java property to an XML element
 * with anonymous type.</p>
 * <p>
 *
 * @author Joan Balaguer, xmlrobot.org, Order.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Extension {

}