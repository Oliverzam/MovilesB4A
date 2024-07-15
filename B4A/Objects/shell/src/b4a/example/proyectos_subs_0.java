package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class proyectos_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private jsonParser As JSONParser";
proyectos._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",proyectos._jsonparser);
 //BA.debugLineNum = 3;BA.debugLine="Private apiJob As HttpJob";
proyectos._apijob = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_apijob",proyectos._apijob);
 //BA.debugLineNum = 4;BA.debugLine="Public apiURL As String";
proyectos._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",proyectos._apiurl);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre_proyecto,RemoteObject _horas_asignadas,RemoteObject _fecha_asignacion,RemoteObject _empleadosid) throws Exception{
try {
		Debug.PushSubsStack("Create (proyectos) ","proyectos",8,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "proyectos","create", __ref, _id, _nombre_proyecto, _horas_asignadas, _fecha_asignacion, _empleadosid);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_id,_nombre_proyecto,_horas_asignadas,_fecha_asignacion,_empleadosid);
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
public ResumableSub_Create(b4a.example.proyectos parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre_proyecto,RemoteObject _horas_asignadas,RemoteObject _fecha_asignacion,RemoteObject _empleadosid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre_proyecto = _nombre_proyecto;
this._horas_asignadas = _horas_asignadas;
this._fecha_asignacion = _fecha_asignacion;
this._empleadosid = _empleadosid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.proyectos parent;
RemoteObject _id;
RemoteObject _nombre_proyecto;
RemoteObject _horas_asignadas;
RemoteObject _fecha_asignacion;
RemoteObject _empleadosid;
RemoteObject _clase = RemoteObject.declareNull("b4a.example.proyecto");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (proyectos) ","proyectos",8,__ref.getField(false, "ba"),__ref,12);
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
Debug.locals.put("Id", _id);
Debug.locals.put("Nombre_Proyecto", _nombre_proyecto);
Debug.locals.put("Horas_Asignadas", _horas_asignadas);
Debug.locals.put("Fecha_Asignacion", _fecha_asignacion);
Debug.locals.put("EmpleadosId", _empleadosid);
 BA.debugLineNum = 13;BA.debugLine="Dim clase As Proyecto";
Debug.ShouldStop(4096);
_clase = RemoteObject.createNew ("b4a.example.proyecto");Debug.locals.put("clase", _clase);
 BA.debugLineNum = 14;BA.debugLine="Dim json As String";
Debug.ShouldStop(8192);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 15;BA.debugLine="Dim data As Map";
Debug.ShouldStop(16384);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 17;BA.debugLine="clase.Initialize()";
Debug.ShouldStop(65536);
_clase.runClassMethod (b4a.example.proyecto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="json = \"{\"\"id\"\":0, \"\"nombre_Proyecto\"\": \"\"\" & Nom";
Debug.ShouldStop(131072);
_json = RemoteObject.concat(RemoteObject.createImmutable("{\"id\":0, \"nombre_Proyecto\": \""),_nombre_proyecto,RemoteObject.createImmutable("\", \"horas_Asignadas\": "),_horas_asignadas,RemoteObject.createImmutable(", \"fecha_Asignacion\": "),_fecha_asignacion,RemoteObject.createImmutable(", \"empleadosId\": "),_empleadosid,RemoteObject.createImmutable("}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 20;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(524288);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 21;BA.debugLine="apiJob.PostString(apiURL, json)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json));
 BA.debugLineNum = 22;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(2097152);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 23;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "proyectos", "create"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 24;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 25;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 26;BA.debugLine="data = jsonParser.NextObject";
Debug.ShouldStop(33554432);
_data = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("data", _data);
 BA.debugLineNum = 27;BA.debugLine="clase.Id = data.Get(\"id\")";
Debug.ShouldStop(67108864);
_clase.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 28;BA.debugLine="clase.Nombre_Proyecto = data.Get(\"nombre_Proyect";
Debug.ShouldStop(134217728);
_clase.setField ("_nombre_proyecto" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre_Proyecto"))))));
 BA.debugLineNum = 29;BA.debugLine="clase.Horas_Asignadas = data.Get(\"horas_Asignada";
Debug.ShouldStop(268435456);
_clase.setField ("_horas_asignadas" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("horas_Asignadas"))))));
 BA.debugLineNum = 30;BA.debugLine="clase.Fecha_Asignacion = data.Get(\"fecha_Asignac";
Debug.ShouldStop(536870912);
_clase.setField ("_fecha_asignacion" /*RemoteObject*/ ,BA.numberCast(long.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fecha_Asignacion"))))));
 BA.debugLineNum = 31;BA.debugLine="clase.EmpleadosId = data.Get(\"empleadosId\")";
Debug.ShouldStop(1073741824);
_clase.setField ("_empleadosid" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("empleadosId"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 33;BA.debugLine="Return clase";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_clase));return;};
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Delete (proyectos) ","proyectos",8,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "proyectos","delete", __ref, _id);}
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
public ResumableSub_Delete(b4a.example.proyectos parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.proyectos parent;
RemoteObject _id;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (proyectos) ","proyectos",8,__ref.getField(false, "ba"),__ref,68);
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
Debug.locals.put("Id", _id);
 BA.debugLineNum = 69;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(16);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 70;BA.debugLine="apiJob.Delete(apiURL & \"/\" & Id)";
Debug.ShouldStop(32);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 72;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "proyectos", "delete"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 73;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 74;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (proyectos) ","proyectos",8,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "proyectos","initialize", __ref, _ba, _url);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("url", _url);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(url As String)";
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
public static RemoteObject  _read_byid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (proyectos) ","proyectos",8,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "proyectos","read_byid", __ref, _id);}
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
public ResumableSub_Read_ById(b4a.example.proyectos parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.proyectos parent;
RemoteObject _id;
RemoteObject _clase = RemoteObject.declareNull("b4a.example.proyecto");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (proyectos) ","proyectos",8,__ref.getField(false, "ba"),__ref,36);
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
Debug.locals.put("Id", _id);
 BA.debugLineNum = 37;BA.debugLine="Dim clase As Proyecto";
Debug.ShouldStop(16);
_clase = RemoteObject.createNew ("b4a.example.proyecto");Debug.locals.put("clase", _clase);
 BA.debugLineNum = 38;BA.debugLine="clase.Initialize()";
Debug.ShouldStop(32);
_clase.runClassMethod (b4a.example.proyecto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 40;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(128);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 41;BA.debugLine="apiJob.Download(apiURL & \"/\" & Id)";
Debug.ShouldStop(256);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 42;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "proyectos", "read_byid"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 43;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 44;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(2048);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(4096);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 46;BA.debugLine="clase.Id = map.Get(\"id\")";
Debug.ShouldStop(8192);
_clase.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 47;BA.debugLine="clase.Nombre_Proyecto = map.Get(\"nombre_Proyecto";
Debug.ShouldStop(16384);
_clase.setField ("_nombre_proyecto" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre_Proyecto"))))));
 BA.debugLineNum = 48;BA.debugLine="clase.Horas_Asignadas = map.Get(\"horas_Asignadas";
Debug.ShouldStop(32768);
_clase.setField ("_horas_asignadas" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("horas_Asignadas"))))));
 BA.debugLineNum = 49;BA.debugLine="clase.EmpleadosId = map.Get(\"empleadosId\")";
Debug.ShouldStop(65536);
_clase.setField ("_empleadosid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("empleadosId"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 51;BA.debugLine="Return clase";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_clase));return;};
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre_proyecto,RemoteObject _horas_asignadas,RemoteObject _fecha_asignacion,RemoteObject _empleadosid) throws Exception{
try {
		Debug.PushSubsStack("Update (proyectos) ","proyectos",8,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "proyectos","update", __ref, _id, _nombre_proyecto, _horas_asignadas, _fecha_asignacion, _empleadosid);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_nombre_proyecto,_horas_asignadas,_fecha_asignacion,_empleadosid);
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
public ResumableSub_Update(b4a.example.proyectos parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre_proyecto,RemoteObject _horas_asignadas,RemoteObject _fecha_asignacion,RemoteObject _empleadosid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre_proyecto = _nombre_proyecto;
this._horas_asignadas = _horas_asignadas;
this._fecha_asignacion = _fecha_asignacion;
this._empleadosid = _empleadosid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.proyectos parent;
RemoteObject _id;
RemoteObject _nombre_proyecto;
RemoteObject _horas_asignadas;
RemoteObject _fecha_asignacion;
RemoteObject _empleadosid;
RemoteObject _clase = RemoteObject.declareNull("b4a.example.proyecto");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (proyectos) ","proyectos",8,__ref.getField(false, "ba"),__ref,54);
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
Debug.locals.put("Id", _id);
Debug.locals.put("Nombre_Proyecto", _nombre_proyecto);
Debug.locals.put("Horas_Asignadas", _horas_asignadas);
Debug.locals.put("Fecha_Asignacion", _fecha_asignacion);
Debug.locals.put("EmpleadosId", _empleadosid);
 BA.debugLineNum = 55;BA.debugLine="Dim clase As Proyecto";
Debug.ShouldStop(4194304);
_clase = RemoteObject.createNew ("b4a.example.proyecto");Debug.locals.put("clase", _clase);
 BA.debugLineNum = 56;BA.debugLine="Dim json As String";
Debug.ShouldStop(8388608);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 57;BA.debugLine="clase.Initialize()";
Debug.ShouldStop(16777216);
_clase.runClassMethod (b4a.example.proyecto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 58;BA.debugLine="json = \"{\"\"Id\"\": \" & Id & \", \"\"Nombre_Proyecto\"\":";
Debug.ShouldStop(33554432);
_json = RemoteObject.concat(RemoteObject.createImmutable("{\"Id\": "),_id,RemoteObject.createImmutable(", \"Nombre_Proyecto\": \""),_nombre_proyecto,RemoteObject.createImmutable("\", \"Horas_Asignadas\": "),_horas_asignadas,RemoteObject.createImmutable(", \"Fecha_Asignacion\": "),_fecha_asignacion,RemoteObject.createImmutable(", \"EmpleadosId\": "),_empleadosid,RemoteObject.createImmutable("}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 60;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 61;BA.debugLine="apiJob.PutString(apiURL & \"/\" & Id, json)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json));
 BA.debugLineNum = 62;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(536870912);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 64;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "proyectos", "update"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 65;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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