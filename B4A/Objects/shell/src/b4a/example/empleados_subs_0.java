package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class empleados_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private jsonParser As JSONParser";
empleados._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",empleados._jsonparser);
 //BA.debugLineNum = 3;BA.debugLine="Private apiJob As HttpJob";
empleados._apijob = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_apijob",empleados._apijob);
 //BA.debugLineNum = 4;BA.debugLine="Public apiURL As String";
empleados._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",empleados._apiurl);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _cargo,RemoteObject _salario,RemoteObject _departamento) throws Exception{
try {
		Debug.PushSubsStack("Create (empleados) ","empleados",5,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "empleados","create", __ref, _id, _nombre, _cargo, _salario, _departamento);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_id,_nombre,_cargo,_salario,_departamento);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.empleados parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _cargo,RemoteObject _salario,RemoteObject _departamento) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._cargo = _cargo;
this._salario = _salario;
this._departamento = _departamento;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.empleados parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _cargo;
RemoteObject _salario;
RemoteObject _departamento;
RemoteObject _clase = RemoteObject.declareNull("b4a.example.empleado");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (empleados) ","empleados",5,__ref.getField(false, "ba"),__ref,12);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("Cargo", _cargo);
Debug.locals.put("Salario", _salario);
Debug.locals.put("Departamento", _departamento);
 BA.debugLineNum = 13;BA.debugLine="Dim clase As Empleado";
Debug.ShouldStop(4096);
_clase = RemoteObject.createNew ("b4a.example.empleado");Debug.locals.put("clase", _clase);
 BA.debugLineNum = 14;BA.debugLine="Dim json As String";
Debug.ShouldStop(8192);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 15;BA.debugLine="Dim data As Map";
Debug.ShouldStop(16384);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 17;BA.debugLine="clase.Initialize()";
Debug.ShouldStop(65536);
_clase.runClassMethod (b4a.example.empleado.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="json = \"{'id':0, 'nombre': '\" & Nombre & \"', 'car";
Debug.ShouldStop(131072);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'id':0, 'nombre': '"),_nombre,RemoteObject.createImmutable("', 'cargo': '"),_cargo,RemoteObject.createImmutable("', 'salario': "),_salario,RemoteObject.createImmutable(", 'departamento': '"),_departamento,RemoteObject.createImmutable("'}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 21;BA.debugLine="apiJob.Initialize(\"\",Me)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 22;BA.debugLine="apiJob.PostString(apiURL, json)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json));
 BA.debugLineNum = 23;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(4194304);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 24;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "empleados", "create"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 25;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 26;BA.debugLine="jsonParser.Initialize( resultado.GetString)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 27;BA.debugLine="data = jsonParser.NextObject";
Debug.ShouldStop(67108864);
_data = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("data", _data);
 BA.debugLineNum = 28;BA.debugLine="clase.Id = data.Get(\"id\")";
Debug.ShouldStop(134217728);
_clase.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 29;BA.debugLine="clase.Nombre=data.Get(\"nombre\")";
Debug.ShouldStop(268435456);
_clase.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 30;BA.debugLine="clase.Cargo=data.Get(\"cargo\")";
Debug.ShouldStop(536870912);
_clase.setField ("_cargo" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cargo"))))));
 BA.debugLineNum = 31;BA.debugLine="clase.Salario=data.Get(\"salario\")";
Debug.ShouldStop(1073741824);
_clase.setField ("_salario" /*RemoteObject*/ ,BA.numberCast(double.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("salario"))))));
 BA.debugLineNum = 32;BA.debugLine="clase.Departamento=data.Get(\"departamento\")";
Debug.ShouldStop(-2147483648);
_clase.setField ("_departamento" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("departamento"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 34;BA.debugLine="Return clase";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_clase));return;};
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (empleados) ","empleados",5,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "empleados","delete", __ref, _id);}
ResumableSub_Delete rsub = new ResumableSub_Delete(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.empleados parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.empleados parent;
RemoteObject _id;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (empleados) ","empleados",5,__ref.getField(false, "ba"),__ref,99);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 101;BA.debugLine="apiJob.Initialize(\"\",Me)";
Debug.ShouldStop(16);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 102;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
Debug.ShouldStop(32);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 104;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "empleados", "delete"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 105;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("Initialize (empleados) ","empleados",5,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "empleados","initialize", __ref, _ba, _url);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("url", _url);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize  (url As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="apiURL = url";
Debug.ShouldStop(256);
__ref.setField ("_apiurl" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_all(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_All (empleados) ","empleados",5,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "empleados","read_all", __ref);}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.empleados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.empleados parent;
RemoteObject _c1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _c2 = RemoteObject.declareNull("b4a.example.empleado");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
int _i = 0;
int step13;
int limit13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_All (empleados) ","empleados",5,__ref.getField(false, "ba"),__ref,36);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 37;BA.debugLine="Dim c1 As List";
Debug.ShouldStop(16);
_c1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("c1", _c1);
 BA.debugLineNum = 38;BA.debugLine="Dim c2 As Empleado";
Debug.ShouldStop(32);
_c2 = RemoteObject.createNew ("b4a.example.empleado");Debug.locals.put("c2", _c2);
 BA.debugLineNum = 39;BA.debugLine="Dim map As Map";
Debug.ShouldStop(64);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 40;BA.debugLine="Dim lista As List";
Debug.ShouldStop(128);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 42;BA.debugLine="c1.Initialize";
Debug.ShouldStop(512);
_c1.runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="c2.Initialize";
Debug.ShouldStop(1024);
_c2.runClassMethod (b4a.example.empleado.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 45;BA.debugLine="apiJob.Initialize(\"\",Me)";
Debug.ShouldStop(4096);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 46;BA.debugLine="apiJob.Download(apiURL)";
Debug.ShouldStop(8192);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "empleados", "read_all"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 48;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 8;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 49;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(65536);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="lista = jsonParser.NextArray";
Debug.ShouldStop(131072);
_lista = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextArray");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 51;BA.debugLine="For i = 0 To lista.Size - 1";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//for
this.state = 7;
step13 = 1;
limit13 = RemoteObject.solve(new RemoteObject[] {_lista.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step13)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 52;BA.debugLine="map = lista.Get(i)";
Debug.ShouldStop(524288);
_map = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lista.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 53;BA.debugLine="Dim c2 As Empleado";
Debug.ShouldStop(1048576);
_c2 = RemoteObject.createNew ("b4a.example.empleado");Debug.locals.put("c2", _c2);
 BA.debugLineNum = 54;BA.debugLine="c2.Initialize";
Debug.ShouldStop(2097152);
_c2.runClassMethod (b4a.example.empleado.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 55;BA.debugLine="c2.Id = map.Get(\"id\")";
Debug.ShouldStop(4194304);
_c2.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 56;BA.debugLine="c2.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(8388608);
_c2.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 57;BA.debugLine="c2.Cargo=map.Get(\"cargo\")";
Debug.ShouldStop(16777216);
_c2.setField ("_cargo" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cargo"))))));
 BA.debugLineNum = 58;BA.debugLine="c2.Salario = map.Get(\"salario\")";
Debug.ShouldStop(33554432);
_c2.setField ("_salario" /*RemoteObject*/ ,BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("salario"))))));
 BA.debugLineNum = 59;BA.debugLine="c2.Departamento=map.Get(\"departamento\")";
Debug.ShouldStop(67108864);
_c2.setField ("_departamento" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("departamento"))))));
 BA.debugLineNum = 60;BA.debugLine="c1.Add(c2)";
Debug.ShouldStop(134217728);
_c1.runVoidMethod ("Add",(Object)((_c2)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 64;BA.debugLine="Return c1";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_c1));return;};
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _read_byid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (empleados) ","empleados",5,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "empleados","read_byid", __ref, _id);}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.empleados parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.empleados parent;
RemoteObject _id;
RemoteObject _clase = RemoteObject.declareNull("b4a.example.empleado");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (empleados) ","empleados",5,__ref.getField(false, "ba"),__ref,66);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 67;BA.debugLine="Dim clase As Empleado";
Debug.ShouldStop(4);
_clase = RemoteObject.createNew ("b4a.example.empleado");Debug.locals.put("clase", _clase);
 BA.debugLineNum = 68;BA.debugLine="clase.Initialize";
Debug.ShouldStop(8);
_clase.runClassMethod (b4a.example.empleado.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 70;BA.debugLine="apiJob.Initialize(\"\",Me)";
Debug.ShouldStop(32);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 71;BA.debugLine="apiJob.Download(apiURL &\"/\"& id)";
Debug.ShouldStop(64);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 72;BA.debugLine="Wait For (apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "empleados", "read_byid"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 73;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 74;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(512);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 75;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(1024);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 76;BA.debugLine="clase.Id = map.Get(\"id\")";
Debug.ShouldStop(2048);
_clase.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 77;BA.debugLine="clase.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(4096);
_clase.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 78;BA.debugLine="clase.Cargo=map.Get(\"cargo\")";
Debug.ShouldStop(8192);
_clase.setField ("_cargo" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cargo"))))));
 BA.debugLineNum = 79;BA.debugLine="clase.Salario = map.Get(\"salario\")";
Debug.ShouldStop(16384);
_clase.setField ("_salario" /*RemoteObject*/ ,BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("salario"))))));
 BA.debugLineNum = 80;BA.debugLine="clase.Departamento=map.Get(\"departamento\")";
Debug.ShouldStop(32768);
_clase.setField ("_departamento" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("departamento"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 82;BA.debugLine="Return clase";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_clase));return;};
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _cargo,RemoteObject _salario,RemoteObject _departamento) throws Exception{
try {
		Debug.PushSubsStack("Update (empleados) ","empleados",5,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "empleados","update", __ref, _id, _nombre, _cargo, _salario, _departamento);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_nombre,_cargo,_salario,_departamento);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.empleados parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _cargo,RemoteObject _salario,RemoteObject _departamento) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._cargo = _cargo;
this._salario = _salario;
this._departamento = _departamento;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.empleados parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _cargo;
RemoteObject _salario;
RemoteObject _departamento;
RemoteObject _clase = RemoteObject.declareNull("b4a.example.empleado");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (empleados) ","empleados",5,__ref.getField(false, "ba"),__ref,84);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("Cargo", _cargo);
Debug.locals.put("Salario", _salario);
Debug.locals.put("Departamento", _departamento);
 BA.debugLineNum = 85;BA.debugLine="Dim clase As Empleado";
Debug.ShouldStop(1048576);
_clase = RemoteObject.createNew ("b4a.example.empleado");Debug.locals.put("clase", _clase);
 BA.debugLineNum = 86;BA.debugLine="Dim json As String";
Debug.ShouldStop(2097152);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 88;BA.debugLine="clase.Initialize()";
Debug.ShouldStop(8388608);
_clase.runClassMethod (b4a.example.empleado.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 89;BA.debugLine="json = \"{\"\"id\"\": \" & id & \", \"\"nombre\"\": \"\"\" & No";
Debug.ShouldStop(16777216);
_json = RemoteObject.concat(RemoteObject.createImmutable("{\"id\": "),_id,RemoteObject.createImmutable(", \"nombre\": \""),_nombre,RemoteObject.createImmutable("\", \"cargo\": \""),_cargo,RemoteObject.createImmutable("\", \"salario\": "),_salario,RemoteObject.createImmutable(", \"departamento\": \""),_departamento,RemoteObject.createImmutable("\"}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 91;BA.debugLine="apiJob.Initialize(\"\",Me)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 92;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json));
 BA.debugLineNum = 93;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(268435456);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 95;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "empleados", "update"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 96;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}