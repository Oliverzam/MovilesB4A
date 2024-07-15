package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class proyecto_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id As Int";
proyecto._id = RemoteObject.createImmutable(0);__ref.setField("_id",proyecto._id);
 //BA.debugLineNum = 3;BA.debugLine="Public Nombre_Proyecto As String";
proyecto._nombre_proyecto = RemoteObject.createImmutable("");__ref.setField("_nombre_proyecto",proyecto._nombre_proyecto);
 //BA.debugLineNum = 4;BA.debugLine="Public Horas_Asignadas As Int";
proyecto._horas_asignadas = RemoteObject.createImmutable(0);__ref.setField("_horas_asignadas",proyecto._horas_asignadas);
 //BA.debugLineNum = 5;BA.debugLine="Public Fecha_Asignacion As Long";
proyecto._fecha_asignacion = RemoteObject.createImmutable(0L);__ref.setField("_fecha_asignacion",proyecto._fecha_asignacion);
 //BA.debugLineNum = 6;BA.debugLine="Public EmpleadosId As Int";
proyecto._empleadosid = RemoteObject.createImmutable(0);__ref.setField("_empleadosid",proyecto._empleadosid);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (proyecto) ","proyecto",7,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "proyecto","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Return Me";
Debug.ShouldStop(1024);
if (true) return __ref;
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}