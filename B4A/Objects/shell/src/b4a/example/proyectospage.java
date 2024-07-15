
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class proyectospage {
    public static RemoteObject myClass;
	public proyectospage() {
	}
    public static PCBA staticBA = new PCBA(null, proyectospage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _txtid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtnombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txthoras = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtfecha = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _apiclas = RemoteObject.declareNull("b4a.example.proyectos");
public static RemoteObject _txtidempleado = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"apiClas",_ref.getField(false, "_apiclas"),"Root",_ref.getField(false, "_root"),"txtFecha",_ref.getField(false, "_txtfecha"),"txtHoras",_ref.getField(false, "_txthoras"),"txtId",_ref.getField(false, "_txtid"),"txtidEmpleado",_ref.getField(false, "_txtidempleado"),"txtNombre",_ref.getField(false, "_txtnombre"),"xui",_ref.getField(false, "_xui")};
}
}