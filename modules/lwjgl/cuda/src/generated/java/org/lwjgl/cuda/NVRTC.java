/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVRTC {

    private static final SharedLibrary NVRTC          = CUDA.getToolkitLibrary(NVRTC.class, Configuration.CUDA_NVRTC_LIBRARY_NAME, "nvrtc");
    private static final SharedLibrary NVRTC_BUILTINS = CUDA.getToolkitLibrary(NVRTC.class, Configuration.CUDA_NVRTC_BUILTINS_LIBRARY_NAME, "nvrtc-builtins");

    /** Contains the function pointers loaded from the NVRTC {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetErrorString       = apiGetFunctionAddress(NVRTC, "nvrtcGetErrorString"),
            Version              = apiGetFunctionAddress(NVRTC, "nvrtcVersion"),
            GetNumSupportedArchs = apiGetFunctionAddressOptional(NVRTC, "nvrtcGetNumSupportedArchs"),
            GetSupportedArchs    = apiGetFunctionAddressOptional(NVRTC, "nvrtcGetSupportedArchs"),
            CreateProgram        = apiGetFunctionAddress(NVRTC, "nvrtcCreateProgram"),
            DestroyProgram       = apiGetFunctionAddress(NVRTC, "nvrtcDestroyProgram"),
            CompileProgram       = apiGetFunctionAddress(NVRTC, "nvrtcCompileProgram"),
            GetPTXSize           = apiGetFunctionAddress(NVRTC, "nvrtcGetPTXSize"),
            GetPTX               = apiGetFunctionAddress(NVRTC, "nvrtcGetPTX"),
            GetCUBINSize         = apiGetFunctionAddressOptional(NVRTC, "nvrtcGetCUBINSize"),
            GetCUBIN             = apiGetFunctionAddressOptional(NVRTC, "nvrtcGetCUBIN"),
            GetNVVMSize          = apiGetFunctionAddressOptional(NVRTC, "nvrtcGetNVVMSize"),
            GetNVVM              = apiGetFunctionAddressOptional(NVRTC, "nvrtcGetNVVM"),
            GetLTOIRSize         = apiGetFunctionAddressOptional(NVRTC, "nvrtcGetLTOIRSize"),
            GetLTOIR             = apiGetFunctionAddressOptional(NVRTC, "nvrtcGetLTOIR"),
            GetOptiXIRSize       = apiGetFunctionAddressOptional(NVRTC, "nvrtcGetOptiXIRSize"),
            GetOptiXIR           = apiGetFunctionAddressOptional(NVRTC, "nvrtcGetOptiXIR"),
            GetProgramLogSize    = apiGetFunctionAddress(NVRTC, "nvrtcGetProgramLogSize"),
            GetProgramLog        = apiGetFunctionAddress(NVRTC, "nvrtcGetProgramLog"),
            AddNameExpression    = apiGetFunctionAddress(NVRTC, "nvrtcAddNameExpression"),
            GetLoweredName       = apiGetFunctionAddress(NVRTC, "nvrtcGetLoweredName");

    }

    /** Returns the NVRTC {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return NVRTC;
    }

    public static final int
        NVRTC_SUCCESS                                     = 0,
        NVRTC_ERROR_OUT_OF_MEMORY                         = 1,
        NVRTC_ERROR_PROGRAM_CREATION_FAILURE              = 2,
        NVRTC_ERROR_INVALID_INPUT                         = 3,
        NVRTC_ERROR_INVALID_PROGRAM                       = 4,
        NVRTC_ERROR_INVALID_OPTION                        = 5,
        NVRTC_ERROR_COMPILATION                           = 6,
        NVRTC_ERROR_BUILTIN_OPERATION_FAILURE             = 7,
        NVRTC_ERROR_NO_NAME_EXPRESSIONS_AFTER_COMPILATION = 8,
        NVRTC_ERROR_NO_LOWERED_NAMES_BEFORE_COMPILATION   = 9,
        NVRTC_ERROR_NAME_EXPRESSION_NOT_VALID             = 10,
        NVRTC_ERROR_INTERNAL_ERROR                        = 11,
        NVRTC_ERROR_TIME_FILE_WRITE_FAILED                = 12;

    protected NVRTC() {
        throw new UnsupportedOperationException();
    }

    // --- [ nvrtcGetErrorString ] ---

    /** {@code char const * nvrtcGetErrorString(nvrtcResult result)} */
    public static long nnvrtcGetErrorString(int result) {
        long __functionAddress = Functions.GetErrorString;
        return callP(result, __functionAddress);
    }

    /** {@code char const * nvrtcGetErrorString(nvrtcResult result)} */
    @NativeType("char const *")
    public static @Nullable String nvrtcGetErrorString(@NativeType("nvrtcResult") int result) {
        long __result = nnvrtcGetErrorString(result);
        return memASCIISafe(__result);
    }

    // --- [ nvrtcVersion ] ---

    /** {@code nvrtcResult nvrtcVersion(int * major, int * minor)} */
    public static int nnvrtcVersion(long major, long minor) {
        long __functionAddress = Functions.Version;
        return callPPI(major, minor, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcVersion(int * major, int * minor)} */
    @NativeType("nvrtcResult")
    public static int nvrtcVersion(@NativeType("int *") IntBuffer major, @NativeType("int *") IntBuffer minor) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
        }
        return nnvrtcVersion(memAddress(major), memAddress(minor));
    }

    // --- [ nvrtcGetNumSupportedArchs ] ---

    /** {@code nvrtcResult nvrtcGetNumSupportedArchs(int * numArchs)} */
    public static int nnvrtcGetNumSupportedArchs(long numArchs) {
        long __functionAddress = Functions.GetNumSupportedArchs;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(numArchs, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetNumSupportedArchs(int * numArchs)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetNumSupportedArchs(@NativeType("int *") IntBuffer numArchs) {
        if (CHECKS) {
            check(numArchs, 1);
        }
        return nnvrtcGetNumSupportedArchs(memAddress(numArchs));
    }

    // --- [ nvrtcGetSupportedArchs ] ---

    /** {@code nvrtcResult nvrtcGetSupportedArchs(int * supportedArchs)} */
    public static int nnvrtcGetSupportedArchs(long supportedArchs) {
        long __functionAddress = Functions.GetSupportedArchs;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(supportedArchs, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetSupportedArchs(int * supportedArchs)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetSupportedArchs(@NativeType("int *") IntBuffer supportedArchs) {
        return nnvrtcGetSupportedArchs(memAddress(supportedArchs));
    }

    // --- [ nvrtcCreateProgram ] ---

    /** {@code nvrtcResult nvrtcCreateProgram(nvrtcProgram * prog, char const * src, char const * name, int numHeaders, char const * const * headers, char const * const * includeNames)} */
    public static int nnvrtcCreateProgram(long prog, long src, long name, int numHeaders, long headers, long includeNames) {
        long __functionAddress = Functions.CreateProgram;
        return callPPPPPI(prog, src, name, numHeaders, headers, includeNames, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcCreateProgram(nvrtcProgram * prog, char const * src, char const * name, int numHeaders, char const * const * headers, char const * const * includeNames)} */
    @NativeType("nvrtcResult")
    public static int nvrtcCreateProgram(@NativeType("nvrtcProgram *") PointerBuffer prog, @NativeType("char const *") ByteBuffer src, @NativeType("char const *") @Nullable ByteBuffer name, @NativeType("char const * const *") @Nullable PointerBuffer headers, @NativeType("char const * const *") @Nullable PointerBuffer includeNames) {
        if (CHECKS) {
            check(prog, 1);
            checkNT1(src);
            checkNT1Safe(name);
            checkSafe(includeNames, remainingSafe(headers));
        }
        return nnvrtcCreateProgram(memAddress(prog), memAddress(src), memAddressSafe(name), remainingSafe(headers), memAddressSafe(headers), memAddressSafe(includeNames));
    }

    /** {@code nvrtcResult nvrtcCreateProgram(nvrtcProgram * prog, char const * src, char const * name, int numHeaders, char const * const * headers, char const * const * includeNames)} */
    @NativeType("nvrtcResult")
    public static int nvrtcCreateProgram(@NativeType("nvrtcProgram *") PointerBuffer prog, @NativeType("char const *") CharSequence src, @NativeType("char const *") @Nullable CharSequence name, @NativeType("char const * const *") @Nullable PointerBuffer headers, @NativeType("char const * const *") @Nullable PointerBuffer includeNames) {
        if (CHECKS) {
            check(prog, 1);
            checkSafe(includeNames, remainingSafe(headers));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(src, true);
            long srcEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(name, true);
            long nameEncoded = name == null ? NULL : stack.getPointerAddress();
            return nnvrtcCreateProgram(memAddress(prog), srcEncoded, nameEncoded, remainingSafe(headers), memAddressSafe(headers), memAddressSafe(includeNames));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvrtcDestroyProgram ] ---

    /** {@code nvrtcResult nvrtcDestroyProgram(nvrtcProgram * prog)} */
    public static int nnvrtcDestroyProgram(long prog) {
        long __functionAddress = Functions.DestroyProgram;
        return callPI(prog, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcDestroyProgram(nvrtcProgram * prog)} */
    @NativeType("nvrtcResult")
    public static int nvrtcDestroyProgram(@NativeType("nvrtcProgram *") PointerBuffer prog) {
        if (CHECKS) {
            check(prog, 1);
        }
        return nnvrtcDestroyProgram(memAddress(prog));
    }

    // --- [ nvrtcCompileProgram ] ---

    /** {@code nvrtcResult nvrtcCompileProgram(nvrtcProgram prog, int numOptions, char const * const * options)} */
    public static int nnvrtcCompileProgram(long prog, int numOptions, long options) {
        long __functionAddress = Functions.CompileProgram;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, numOptions, options, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcCompileProgram(nvrtcProgram prog, int numOptions, char const * const * options)} */
    @NativeType("nvrtcResult")
    public static int nvrtcCompileProgram(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const *") @Nullable PointerBuffer options) {
        return nnvrtcCompileProgram(prog, remainingSafe(options), memAddressSafe(options));
    }

    // --- [ nvrtcGetPTXSize ] ---

    /** {@code nvrtcResult nvrtcGetPTXSize(nvrtcProgram prog, size_t * ptxSizeRet)} */
    public static int nnvrtcGetPTXSize(long prog, long ptxSizeRet) {
        long __functionAddress = Functions.GetPTXSize;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, ptxSizeRet, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetPTXSize(nvrtcProgram prog, size_t * ptxSizeRet)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetPTXSize(@NativeType("nvrtcProgram") long prog, @NativeType("size_t *") PointerBuffer ptxSizeRet) {
        if (CHECKS) {
            check(ptxSizeRet, 1);
        }
        return nnvrtcGetPTXSize(prog, memAddress(ptxSizeRet));
    }

    // --- [ nvrtcGetPTX ] ---

    /** {@code nvrtcResult nvrtcGetPTX(nvrtcProgram prog, char * ptx)} */
    public static int nnvrtcGetPTX(long prog, long ptx) {
        long __functionAddress = Functions.GetPTX;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, ptx, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetPTX(nvrtcProgram prog, char * ptx)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetPTX(@NativeType("nvrtcProgram") long prog, @NativeType("char *") ByteBuffer ptx) {
        return nnvrtcGetPTX(prog, memAddress(ptx));
    }

    // --- [ nvrtcGetCUBINSize ] ---

    /** {@code nvrtcResult nvrtcGetCUBINSize(nvrtcProgram prog, size_t * cubinSizeRet)} */
    public static int nnvrtcGetCUBINSize(long prog, long cubinSizeRet) {
        long __functionAddress = Functions.GetCUBINSize;
        if (CHECKS) {
            check(__functionAddress);
            check(prog);
        }
        return callPPI(prog, cubinSizeRet, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetCUBINSize(nvrtcProgram prog, size_t * cubinSizeRet)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetCUBINSize(@NativeType("nvrtcProgram") long prog, @NativeType("size_t *") PointerBuffer cubinSizeRet) {
        if (CHECKS) {
            check(cubinSizeRet, 1);
        }
        return nnvrtcGetCUBINSize(prog, memAddress(cubinSizeRet));
    }

    // --- [ nvrtcGetCUBIN ] ---

    /** {@code nvrtcResult nvrtcGetCUBIN(nvrtcProgram prog, char * cubin)} */
    public static int nnvrtcGetCUBIN(long prog, long cubin) {
        long __functionAddress = Functions.GetCUBIN;
        if (CHECKS) {
            check(__functionAddress);
            check(prog);
        }
        return callPPI(prog, cubin, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetCUBIN(nvrtcProgram prog, char * cubin)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetCUBIN(@NativeType("nvrtcProgram") long prog, @NativeType("char *") ByteBuffer cubin) {
        return nnvrtcGetCUBIN(prog, memAddress(cubin));
    }

    // --- [ nvrtcGetNVVMSize ] ---

    /** {@code nvrtcResult nvrtcGetNVVMSize(nvrtcProgram prog, size_t * nvvmSizeRet)} */
    public static int nnvrtcGetNVVMSize(long prog, long nvvmSizeRet) {
        long __functionAddress = Functions.GetNVVMSize;
        if (CHECKS) {
            check(__functionAddress);
            check(prog);
        }
        return callPPI(prog, nvvmSizeRet, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetNVVMSize(nvrtcProgram prog, size_t * nvvmSizeRet)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetNVVMSize(@NativeType("nvrtcProgram") long prog, @NativeType("size_t *") PointerBuffer nvvmSizeRet) {
        if (CHECKS) {
            check(nvvmSizeRet, 1);
        }
        return nnvrtcGetNVVMSize(prog, memAddress(nvvmSizeRet));
    }

    // --- [ nvrtcGetNVVM ] ---

    /** {@code nvrtcResult nvrtcGetNVVM(nvrtcProgram prog, char * nvvm)} */
    public static int nnvrtcGetNVVM(long prog, long nvvm) {
        long __functionAddress = Functions.GetNVVM;
        if (CHECKS) {
            check(__functionAddress);
            check(prog);
        }
        return callPPI(prog, nvvm, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetNVVM(nvrtcProgram prog, char * nvvm)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetNVVM(@NativeType("nvrtcProgram") long prog, @NativeType("char *") ByteBuffer nvvm) {
        return nnvrtcGetNVVM(prog, memAddress(nvvm));
    }

    // --- [ nvrtcGetLTOIRSize ] ---

    /** {@code nvrtcResult nvrtcGetLTOIRSize(nvrtcProgram prog, size_t * LTOIRSizeRet)} */
    public static int nnvrtcGetLTOIRSize(long prog, long LTOIRSizeRet) {
        long __functionAddress = Functions.GetLTOIRSize;
        if (CHECKS) {
            check(__functionAddress);
            check(prog);
        }
        return callPPI(prog, LTOIRSizeRet, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetLTOIRSize(nvrtcProgram prog, size_t * LTOIRSizeRet)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetLTOIRSize(@NativeType("nvrtcProgram") long prog, @NativeType("size_t *") PointerBuffer LTOIRSizeRet) {
        if (CHECKS) {
            check(LTOIRSizeRet, 1);
        }
        return nnvrtcGetLTOIRSize(prog, memAddress(LTOIRSizeRet));
    }

    // --- [ nvrtcGetLTOIR ] ---

    /** {@code nvrtcResult nvrtcGetLTOIR(nvrtcProgram prog, char * LTOIR)} */
    public static int nnvrtcGetLTOIR(long prog, long LTOIR) {
        long __functionAddress = Functions.GetLTOIR;
        if (CHECKS) {
            check(__functionAddress);
            check(prog);
        }
        return callPPI(prog, LTOIR, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetLTOIR(nvrtcProgram prog, char * LTOIR)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetLTOIR(@NativeType("nvrtcProgram") long prog, @NativeType("char *") ByteBuffer LTOIR) {
        return nnvrtcGetLTOIR(prog, memAddress(LTOIR));
    }

    // --- [ nvrtcGetOptiXIRSize ] ---

    /** {@code nvrtcResult nvrtcGetOptiXIRSize(nvrtcProgram prog, size_t * optixirSizeRet)} */
    public static int nnvrtcGetOptiXIRSize(long prog, long optixirSizeRet) {
        long __functionAddress = Functions.GetOptiXIRSize;
        if (CHECKS) {
            check(__functionAddress);
            check(prog);
        }
        return callPPI(prog, optixirSizeRet, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetOptiXIRSize(nvrtcProgram prog, size_t * optixirSizeRet)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetOptiXIRSize(@NativeType("nvrtcProgram") long prog, @NativeType("size_t *") PointerBuffer optixirSizeRet) {
        if (CHECKS) {
            check(optixirSizeRet, 1);
        }
        return nnvrtcGetOptiXIRSize(prog, memAddress(optixirSizeRet));
    }

    // --- [ nvrtcGetOptiXIR ] ---

    /** {@code nvrtcResult nvrtcGetOptiXIR(nvrtcProgram prog, char * optixir)} */
    public static int nnvrtcGetOptiXIR(long prog, long optixir) {
        long __functionAddress = Functions.GetOptiXIR;
        if (CHECKS) {
            check(__functionAddress);
            check(prog);
        }
        return callPPI(prog, optixir, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetOptiXIR(nvrtcProgram prog, char * optixir)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetOptiXIR(@NativeType("nvrtcProgram") long prog, @NativeType("char *") ByteBuffer optixir) {
        return nnvrtcGetOptiXIR(prog, memAddress(optixir));
    }

    // --- [ nvrtcGetProgramLogSize ] ---

    /** {@code nvrtcResult nvrtcGetProgramLogSize(nvrtcProgram prog, size_t * logSizeRet)} */
    public static int nnvrtcGetProgramLogSize(long prog, long logSizeRet) {
        long __functionAddress = Functions.GetProgramLogSize;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, logSizeRet, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetProgramLogSize(nvrtcProgram prog, size_t * logSizeRet)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetProgramLogSize(@NativeType("nvrtcProgram") long prog, @NativeType("size_t *") PointerBuffer logSizeRet) {
        if (CHECKS) {
            check(logSizeRet, 1);
        }
        return nnvrtcGetProgramLogSize(prog, memAddress(logSizeRet));
    }

    // --- [ nvrtcGetProgramLog ] ---

    /** {@code nvrtcResult nvrtcGetProgramLog(nvrtcProgram prog, char * log)} */
    public static int nnvrtcGetProgramLog(long prog, long log) {
        long __functionAddress = Functions.GetProgramLog;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, log, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetProgramLog(nvrtcProgram prog, char * log)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetProgramLog(@NativeType("nvrtcProgram") long prog, @NativeType("char *") ByteBuffer log) {
        return nnvrtcGetProgramLog(prog, memAddress(log));
    }

    // --- [ nvrtcAddNameExpression ] ---

    /** {@code nvrtcResult nvrtcAddNameExpression(nvrtcProgram prog, char const * const name_expression)} */
    public static int nnvrtcAddNameExpression(long prog, long name_expression) {
        long __functionAddress = Functions.AddNameExpression;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, name_expression, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcAddNameExpression(nvrtcProgram prog, char const * const name_expression)} */
    @NativeType("nvrtcResult")
    public static int nvrtcAddNameExpression(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const") ByteBuffer name_expression) {
        if (CHECKS) {
            checkNT1(name_expression);
        }
        return nnvrtcAddNameExpression(prog, memAddress(name_expression));
    }

    /** {@code nvrtcResult nvrtcAddNameExpression(nvrtcProgram prog, char const * const name_expression)} */
    @NativeType("nvrtcResult")
    public static int nvrtcAddNameExpression(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const") CharSequence name_expression) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name_expression, true);
            long name_expressionEncoded = stack.getPointerAddress();
            return nnvrtcAddNameExpression(prog, name_expressionEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvrtcGetLoweredName ] ---

    /** {@code nvrtcResult nvrtcGetLoweredName(nvrtcProgram prog, char const * const name_expression, char const ** lowered_name)} */
    public static int nnvrtcGetLoweredName(long prog, long name_expression, long lowered_name) {
        long __functionAddress = Functions.GetLoweredName;
        if (CHECKS) {
            check(prog);
        }
        return callPPPI(prog, name_expression, lowered_name, __functionAddress);
    }

    /** {@code nvrtcResult nvrtcGetLoweredName(nvrtcProgram prog, char const * const name_expression, char const ** lowered_name)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetLoweredName(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const") ByteBuffer name_expression, @NativeType("char const **") PointerBuffer lowered_name) {
        if (CHECKS) {
            checkNT1(name_expression);
            check(lowered_name, 1);
        }
        return nnvrtcGetLoweredName(prog, memAddress(name_expression), memAddress(lowered_name));
    }

    /** {@code nvrtcResult nvrtcGetLoweredName(nvrtcProgram prog, char const * const name_expression, char const ** lowered_name)} */
    @NativeType("nvrtcResult")
    public static int nvrtcGetLoweredName(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const") CharSequence name_expression, @NativeType("char const **") PointerBuffer lowered_name) {
        if (CHECKS) {
            check(lowered_name, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name_expression, true);
            long name_expressionEncoded = stack.getPointerAddress();
            return nnvrtcGetLoweredName(prog, name_expressionEncoded, memAddress(lowered_name));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}