
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class proyecto {
    public static RemoteObject myClass;
	public proyecto() {
	}
    public static PCBA staticBA = new PCBA(null, proyecto.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _nombre_proyecto = RemoteObject.createImmutable("");
public static RemoteObject _horas_asignadas = RemoteObject.createImmutable(0);
public static RemoteObject _fecha_asignacion = RemoteObject.createImmutable(0L);
public static RemoteObject _empleadosid = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"EmpleadosId",_ref.getField(false, "_empleadosid"),"Fecha_Asignacion",_ref.getField(false, "_fecha_asignacion"),"Horas_Asignadas",_ref.getField(false, "_horas_asignadas"),"Id",_ref.getField(false, "_id"),"Nombre_Proyecto",_ref.getField(false, "_nombre_proyecto")};
}
}