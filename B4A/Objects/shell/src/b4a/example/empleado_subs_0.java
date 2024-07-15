package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class empleado_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id As Int";
empleado._id = RemoteObject.createImmutable(0);__ref.setField("_id",empleado._id);
 //BA.debugLineNum = 3;BA.debugLine="Public Nombre As String";
empleado._nombre = RemoteObject.createImmutable("");__ref.setField("_nombre",empleado._nombre);
 //BA.debugLineNum = 4;BA.debugLine="Public Cargo As String";
empleado._cargo = RemoteObject.createImmutable("");__ref.setField("_cargo",empleado._cargo);
 //BA.debugLineNum = 5;BA.debugLine="Public Salario As Double";
empleado._salario = RemoteObject.createImmutable(0);__ref.setField("_salario",empleado._salario);
 //BA.debugLineNum = 6;BA.debugLine="Public Departamento As String";
empleado._departamento = RemoteObject.createImmutable("");__ref.setField("_departamento",empleado._departamento);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (empleado) ","empleado",6,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "empleado","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}