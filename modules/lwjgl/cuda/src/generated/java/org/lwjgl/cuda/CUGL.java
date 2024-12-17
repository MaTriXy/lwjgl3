/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.cuda.CUDA.*;

public class CUGL {

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GraphicsGLRegisterBuffer  = apiGetFunctionAddress(CU.getLibrary(), "cuGraphicsGLRegisterBuffer"),
            GraphicsGLRegisterImage   = apiGetFunctionAddress(CU.getLibrary(), "cuGraphicsGLRegisterImage"),
            GLGetDevices              = apiGetFunctionAddressOptional(CU.getLibrary(), __CUDA_API_VERSION("cuGLGetDevices", 2)),
            GLCtxCreate               = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_VERSION("cuGLCtxCreate", 2)),
            GLInit                    = apiGetFunctionAddress(CU.getLibrary(), "cuGLInit"),
            GLRegisterBufferObject    = apiGetFunctionAddress(CU.getLibrary(), "cuGLRegisterBufferObject"),
            GLMapBufferObject         = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTDS(__CUDA_API_VERSION("cuGLMapBufferObject", 2))),
            GLUnmapBufferObject       = apiGetFunctionAddress(CU.getLibrary(), "cuGLUnmapBufferObject"),
            GLUnregisterBufferObject  = apiGetFunctionAddress(CU.getLibrary(), "cuGLUnregisterBufferObject"),
            GLSetBufferObjectMapFlags = apiGetFunctionAddress(CU.getLibrary(), "cuGLSetBufferObjectMapFlags"),
            GLMapBufferObjectAsync    = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ(__CUDA_API_VERSION("cuGLMapBufferObjectAsync", 2))),
            GLUnmapBufferObjectAsync  = apiGetFunctionAddress(CU.getLibrary(), "cuGLUnmapBufferObjectAsync");

    }

    public static final int
        CU_GL_DEVICE_LIST_ALL           = 0x1,
        CU_GL_DEVICE_LIST_CURRENT_FRAME = 0x2,
        CU_GL_DEVICE_LIST_NEXT_FRAME    = 0x3;

    public static final int
        CU_GL_MAP_RESOURCE_FLAGS_NONE          = 0x1,
        CU_GL_MAP_RESOURCE_FLAGS_READ_ONLY     = 0x2,
        CU_GL_MAP_RESOURCE_FLAGS_WRITE_DISCARD = 0x3;

    protected CUGL() {
        throw new UnsupportedOperationException();
    }

    // --- [ cuGraphicsGLRegisterBuffer ] ---

    /** {@code CUresult cuGraphicsGLRegisterBuffer(CUgraphicsResource * pCudaResource, GLuint buffer, unsigned int Flags)} */
    public static int ncuGraphicsGLRegisterBuffer(long pCudaResource, int buffer, int Flags) {
        long __functionAddress = Functions.GraphicsGLRegisterBuffer;
        return callPI(pCudaResource, buffer, Flags, __functionAddress);
    }

    /** {@code CUresult cuGraphicsGLRegisterBuffer(CUgraphicsResource * pCudaResource, GLuint buffer, unsigned int Flags)} */
    @NativeType("CUresult")
    public static int cuGraphicsGLRegisterBuffer(@NativeType("CUgraphicsResource *") PointerBuffer pCudaResource, @NativeType("GLuint") int buffer, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pCudaResource, 1);
        }
        return ncuGraphicsGLRegisterBuffer(memAddress(pCudaResource), buffer, Flags);
    }

    // --- [ cuGraphicsGLRegisterImage ] ---

    /** {@code CUresult cuGraphicsGLRegisterImage(CUgraphicsResource * pCudaResource, GLuint image, GLenum target, unsigned int Flags)} */
    public static int ncuGraphicsGLRegisterImage(long pCudaResource, int image, int target, int Flags) {
        long __functionAddress = Functions.GraphicsGLRegisterImage;
        return callPI(pCudaResource, image, target, Flags, __functionAddress);
    }

    /** {@code CUresult cuGraphicsGLRegisterImage(CUgraphicsResource * pCudaResource, GLuint image, GLenum target, unsigned int Flags)} */
    @NativeType("CUresult")
    public static int cuGraphicsGLRegisterImage(@NativeType("CUgraphicsResource *") PointerBuffer pCudaResource, @NativeType("GLuint") int image, @NativeType("GLenum") int target, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pCudaResource, 1);
        }
        return ncuGraphicsGLRegisterImage(memAddress(pCudaResource), image, target, Flags);
    }

    // --- [ cuGLGetDevices ] ---

    /** {@code CUresult cuGLGetDevices(unsigned int * pCudaDeviceCount, CUdevice * pCudaDevices, unsigned int cudaDeviceCount, CUGLDeviceList deviceList)} */
    public static int ncuGLGetDevices(long pCudaDeviceCount, long pCudaDevices, int cudaDeviceCount, int deviceList) {
        long __functionAddress = Functions.GLGetDevices;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pCudaDeviceCount, pCudaDevices, cudaDeviceCount, deviceList, __functionAddress);
    }

    /** {@code CUresult cuGLGetDevices(unsigned int * pCudaDeviceCount, CUdevice * pCudaDevices, unsigned int cudaDeviceCount, CUGLDeviceList deviceList)} */
    @NativeType("CUresult")
    public static int cuGLGetDevices(@NativeType("unsigned int *") IntBuffer pCudaDeviceCount, @NativeType("CUdevice *") IntBuffer pCudaDevices, @NativeType("CUGLDeviceList") int deviceList) {
        if (CHECKS) {
            check(pCudaDeviceCount, 1);
        }
        return ncuGLGetDevices(memAddress(pCudaDeviceCount), memAddress(pCudaDevices), pCudaDevices.remaining(), deviceList);
    }

    // --- [ cuGLCtxCreate ] ---

    /** {@code CUresult cuGLCtxCreate(CUcontext * pCtx, unsigned int Flags, CUdevice device)} */
    public static int ncuGLCtxCreate(long pCtx, int Flags, int device) {
        long __functionAddress = Functions.GLCtxCreate;
        return callPI(pCtx, Flags, device, __functionAddress);
    }

    /** {@code CUresult cuGLCtxCreate(CUcontext * pCtx, unsigned int Flags, CUdevice device)} */
    @NativeType("CUresult")
    public static int cuGLCtxCreate(@NativeType("CUcontext *") PointerBuffer pCtx, @NativeType("unsigned int") int Flags, @NativeType("CUdevice") int device) {
        if (CHECKS) {
            check(pCtx, 1);
        }
        return ncuGLCtxCreate(memAddress(pCtx), Flags, device);
    }

    // --- [ cuGLInit ] ---

    /** {@code CUresult cuGLInit(void)} */
    @NativeType("CUresult")
    public static int cuGLInit() {
        long __functionAddress = Functions.GLInit;
        return callI(__functionAddress);
    }

    // --- [ cuGLRegisterBufferObject ] ---

    /** {@code CUresult cuGLRegisterBufferObject(GLuint buffer)} */
    @NativeType("CUresult")
    public static int cuGLRegisterBufferObject(@NativeType("GLuint") int buffer) {
        long __functionAddress = Functions.GLRegisterBufferObject;
        return callI(buffer, __functionAddress);
    }

    // --- [ cuGLMapBufferObject ] ---

    /** {@code CUresult cuGLMapBufferObject(CUdeviceptr * dptr, size_t * size, GLuint buffer)} */
    public static int ncuGLMapBufferObject(long dptr, long size, int buffer) {
        long __functionAddress = Functions.GLMapBufferObject;
        return callPPI(dptr, size, buffer, __functionAddress);
    }

    /** {@code CUresult cuGLMapBufferObject(CUdeviceptr * dptr, size_t * size, GLuint buffer)} */
    @NativeType("CUresult")
    public static int cuGLMapBufferObject(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer size, @NativeType("GLuint") int buffer) {
        if (CHECKS) {
            check(dptr, 1);
            check(size, 1);
        }
        return ncuGLMapBufferObject(memAddress(dptr), memAddress(size), buffer);
    }

    // --- [ cuGLUnmapBufferObject ] ---

    /** {@code CUresult cuGLUnmapBufferObject(GLuint buffer)} */
    @NativeType("CUresult")
    public static int cuGLUnmapBufferObject(@NativeType("GLuint") int buffer) {
        long __functionAddress = Functions.GLUnmapBufferObject;
        return callI(buffer, __functionAddress);
    }

    // --- [ cuGLUnregisterBufferObject ] ---

    /** {@code CUresult cuGLUnregisterBufferObject(GLuint buffer)} */
    @NativeType("CUresult")
    public static int cuGLUnregisterBufferObject(@NativeType("GLuint") int buffer) {
        long __functionAddress = Functions.GLUnregisterBufferObject;
        return callI(buffer, __functionAddress);
    }

    // --- [ cuGLSetBufferObjectMapFlags ] ---

    /** {@code CUresult cuGLSetBufferObjectMapFlags(GLuint buffer, unsigned int Flags)} */
    @NativeType("CUresult")
    public static int cuGLSetBufferObjectMapFlags(@NativeType("GLuint") int buffer, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.GLSetBufferObjectMapFlags;
        return callI(buffer, Flags, __functionAddress);
    }

    // --- [ cuGLMapBufferObjectAsync ] ---

    /** {@code CUresult cuGLMapBufferObjectAsync(CUdeviceptr * dptr, size_t * size, GLuint buffer, CUstream hStream)} */
    public static int ncuGLMapBufferObjectAsync(long dptr, long size, int buffer, long hStream) {
        long __functionAddress = Functions.GLMapBufferObjectAsync;
        return callPPPI(dptr, size, buffer, hStream, __functionAddress);
    }

    /** {@code CUresult cuGLMapBufferObjectAsync(CUdeviceptr * dptr, size_t * size, GLuint buffer, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuGLMapBufferObjectAsync(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer size, @NativeType("GLuint") int buffer, @NativeType("CUstream") long hStream) {
        if (CHECKS) {
            check(dptr, 1);
            check(size, 1);
        }
        return ncuGLMapBufferObjectAsync(memAddress(dptr), memAddress(size), buffer, hStream);
    }

    // --- [ cuGLUnmapBufferObjectAsync ] ---

    /** {@code CUresult cuGLUnmapBufferObjectAsync(GLuint buffer, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuGLUnmapBufferObjectAsync(@NativeType("GLuint") int buffer, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.GLUnmapBufferObjectAsync;
        return callPI(buffer, hStream, __functionAddress);
    }

}