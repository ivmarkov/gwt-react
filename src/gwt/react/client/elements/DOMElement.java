package gwt.react.client.elements;

import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class DOMElement<P extends BaseProps> extends ReactElement<P, String> {
    /**
     * Objects of this class cannot be directly instantiated by the user.
     */
	private DOMElement() {
	}
}
