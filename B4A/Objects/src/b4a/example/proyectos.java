package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class proyectos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.proyectos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.proyectos.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
public b4a.example.httpjob _apijob = null;
public String _apiurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.proyectos __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="proyectos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Public Sub Initialize(url As String)";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="apiURL = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.proyectos __ref,int _id,String _nombre_proyecto,int _horas_asignadas,long _fecha_asignacion,int _empleadosid) throws Exception{
RDebugUtils.currentModule="proyectos";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_nombre_proyecto,_horas_asignadas,_fecha_asignacion,_empleadosid}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_nombre_proyecto,_horas_asignadas,_fecha_asignacion,_empleadosid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.proyectos parent,b4a.example.proyectos __ref,int _id,String _nombre_proyecto,int _horas_asignadas,long _fecha_asignacion,int _empleadosid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre_proyecto = _nombre_proyecto;
this._horas_asignadas = _horas_asignadas;
this._fecha_asignacion = _fecha_asignacion;
this._empleadosid = _empleadosid;
this.__ref = parent;
}
b4a.example.proyectos __ref;
b4a.example.proyectos parent;
int _id;
String _nombre_proyecto;
int _horas_asignadas;
long _fecha_asignacion;
int _empleadosid;
b4a.example.proyecto _clase = null;
String _json = "";
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="proyectos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Dim clase As Proyecto";
_clase = new b4a.example.proyecto();
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="clase.Initialize()";
_clase._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="json = \"{\"\"Id\"\": \" & Id & \", \"\"Nombre_Proyecto\"\":";
_json = "{\"Id\": "+BA.NumberToString(_id)+", \"Nombre_Proyecto\": \""+_nombre_proyecto+"\", \"Horas_Asignadas\": "+BA.NumberToString(_horas_asignadas)+", \"Fecha_Asignacion\": "+BA.NumberToString(_fecha_asignacion)+", \"EmpleadosId\": "+BA.NumberToString(_empleadosid)+"}";
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="apiJob.PutString(apiURL & \"/\" & Id, json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=14549002;
 //BA.debugLineNum = 14549002;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "proyectos", "update"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14549003;
 //BA.debugLineNum = 14549003;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=14549004;
 //BA.debugLineNum = 14549004;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.proyectos __ref,int _id) throws Exception{
RDebugUtils.currentModule="proyectos";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.proyectos parent,b4a.example.proyectos __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.proyectos __ref;
b4a.example.proyectos parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="proyectos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="apiJob.Delete(apiURL & \"/\" & Id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "proyectos", "delete"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.proyectos __ref,int _id,String _nombre_proyecto,int _horas_asignadas,long _fecha_asignacion,int _empleadosid) throws Exception{
RDebugUtils.currentModule="proyectos";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_id,_nombre_proyecto,_horas_asignadas,_fecha_asignacion,_empleadosid}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_id,_nombre_proyecto,_horas_asignadas,_fecha_asignacion,_empleadosid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.proyectos parent,b4a.example.proyectos __ref,int _id,String _nombre_proyecto,int _horas_asignadas,long _fecha_asignacion,int _empleadosid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre_proyecto = _nombre_proyecto;
this._horas_asignadas = _horas_asignadas;
this._fecha_asignacion = _fecha_asignacion;
this._empleadosid = _empleadosid;
this.__ref = parent;
}
b4a.example.proyectos __ref;
b4a.example.proyectos parent;
int _id;
String _nombre_proyecto;
int _horas_asignadas;
long _fecha_asignacion;
int _empleadosid;
b4a.example.proyecto _clase = null;
String _json = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="proyectos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Dim clase As Proyecto";
_clase = new b4a.example.proyecto();
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="clase.Initialize()";
_clase._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="json = \"{\"\"id\"\":0, \"\"nombre_Proyecto\"\": \"\"\" & Nom";
_json = "{\"id\":0, \"nombre_Proyecto\": \""+_nombre_proyecto+"\", \"horas_Asignadas\": "+BA.NumberToString(_horas_asignadas)+", \"fecha_Asignacion\": "+BA.NumberToString(_fecha_asignacion)+", \"empleadosId\": "+BA.NumberToString(_empleadosid)+"}";
RDebugUtils.currentLine=14417928;
 //BA.debugLineNum = 14417928;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14417929;
 //BA.debugLineNum = 14417929;BA.debugLine="apiJob.PostString(apiURL, json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=14417930;
 //BA.debugLineNum = 14417930;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=14417931;
 //BA.debugLineNum = 14417931;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "proyectos", "create"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14417932;
 //BA.debugLineNum = 14417932;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14417933;
 //BA.debugLineNum = 14417933;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=14417934;
 //BA.debugLineNum = 14417934;BA.debugLine="data = jsonParser.NextObject";
_data = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=14417935;
 //BA.debugLineNum = 14417935;BA.debugLine="clase.Id = data.Get(\"id\")";
_clase._id /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("id"))));
RDebugUtils.currentLine=14417936;
 //BA.debugLineNum = 14417936;BA.debugLine="clase.Nombre_Proyecto = data.Get(\"nombre_Proyect";
_clase._nombre_proyecto /*String*/  = BA.ObjectToString(_data.Get((Object)("nombre_Proyecto")));
RDebugUtils.currentLine=14417937;
 //BA.debugLineNum = 14417937;BA.debugLine="clase.Horas_Asignadas = data.Get(\"horas_Asignada";
_clase._horas_asignadas /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("horas_Asignadas"))));
RDebugUtils.currentLine=14417938;
 //BA.debugLineNum = 14417938;BA.debugLine="clase.Fecha_Asignacion = data.Get(\"fecha_Asignac";
_clase._fecha_asignacion /*long*/  = BA.ObjectToLongNumber(_data.Get((Object)("fecha_Asignacion")));
RDebugUtils.currentLine=14417939;
 //BA.debugLineNum = 14417939;BA.debugLine="clase.EmpleadosId = data.Get(\"empleadosId\")";
_clase._empleadosid /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("empleadosId"))));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=14417941;
 //BA.debugLineNum = 14417941;BA.debugLine="Return clase";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_clase));return;};
RDebugUtils.currentLine=14417942;
 //BA.debugLineNum = 14417942;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_byid(b4a.example.proyectos __ref,int _id) throws Exception{
RDebugUtils.currentModule="proyectos";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.proyectos parent,b4a.example.proyectos __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.proyectos __ref;
b4a.example.proyectos parent;
int _id;
b4a.example.proyecto _clase = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="proyectos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Dim clase As Proyecto";
_clase = new b4a.example.proyecto();
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="clase.Initialize()";
_clase._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14483461;
 //BA.debugLineNum = 14483461;BA.debugLine="apiJob.Download(apiURL & \"/\" & Id)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "proyectos", "read_byid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14483463;
 //BA.debugLineNum = 14483463;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14483464;
 //BA.debugLineNum = 14483464;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=14483465;
 //BA.debugLineNum = 14483465;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=14483466;
 //BA.debugLineNum = 14483466;BA.debugLine="clase.Id = map.Get(\"id\")";
_clase._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=14483467;
 //BA.debugLineNum = 14483467;BA.debugLine="clase.Nombre_Proyecto = map.Get(\"nombre_Proyecto";
_clase._nombre_proyecto /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre_Proyecto")));
RDebugUtils.currentLine=14483468;
 //BA.debugLineNum = 14483468;BA.debugLine="clase.Horas_Asignadas = map.Get(\"horas_Asignadas";
_clase._horas_asignadas /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("horas_Asignadas"))));
RDebugUtils.currentLine=14483469;
 //BA.debugLineNum = 14483469;BA.debugLine="clase.EmpleadosId = map.Get(\"empleadosId\")";
_clase._empleadosid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("empleadosId"))));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=14483471;
 //BA.debugLineNum = 14483471;BA.debugLine="Return clase";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_clase));return;};
RDebugUtils.currentLine=14483472;
 //BA.debugLineNum = 14483472;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.proyectos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="proyectos";
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="Private apiJob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="Public apiURL As String";
_apiurl = "";
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="End Sub";
return "";
}
}